package homeworkthree;


import java.util.Random;
import java.util.Scanner;

/*
2 * Создать массив из слов
 String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic",
 "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple",
 "pumpkin", "potato"};
При запуске программы компьютер загадывает слово, запрашивает ответ у пользователя,
сравнивает его с загаданным словом и сообщает правильно ли ответил пользователь. Если слово не угадано,
компьютер показывает буквы которые стоят на своих местах.
apple – загаданное
apricot - ответ игрока
ap############# (15 символов, чтобы пользователь не мог узнать длину слова)
Для сравнения двух слов посимвольно, можно пользоваться:
String str = "apple";
str.charAt(0); - метод, вернет char, который стоит в слове str на первой позиции
Играем до тех пор, пока игрок не отгадает слово
Используем только маленькие буквы
 */
public class GuessWord {
    String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic",
            "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple",
            "pumpkin", "potato"};
   public String guess;
   public String randWord;
   int promptNum = 2;
   int starLength = 15;
    public String randomWord () {
        Random rand = new Random();
        int randNumber = rand.nextInt(words.length);
        randWord = words [randNumber];
     //   System.out.println(randWord);
     //   System.out.println(randNumber);
        return randWord;
    }
    public String askForGuess (){
        System.out.println("Can you guess the hidden word?");
        Scanner sc = new Scanner(System.in);
        guess = sc.nextLine();
        System.out.println("Your guess is: " + guess);
        return guess;
    }
    public void checkAnswer () {
        if (guess.equals(randWord)) {
            //System.out.println("You've won! Well done!\n");
        } else {
            while (!guess.equals(randWord)) {
            char star = '*';
            System.out.print("Here is your prompt: ");
            char[] arr = randWord.toCharArray();
            for (int i = 0; i < promptNum ; i++) {
                System.out.print(arr[i]);
                }
            for (int i = 2; i < starLength ; i++) {
                System.out.print(star);
                }
                System.out.println();
            askForGuess();
            }
        }
    }
    public void lastWords () {
        System.out.println("You've won! Well done!\n");
    }
}
