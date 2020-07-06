package main.java.homeworkthree;

import java.util.Scanner;

public class GuessTheNumber {
    public static int secretNumber;

    public static void main(String[] args) {

        gameIntro();
        secNumber();
        System.out.println(secretNumber);
        enterNumber();
        playAgain();
    }

    public static void gameIntro() {
        System.out.println("\n**********Добро пожаловать в игру Угадай Число!********** \n\nУ Вас есть 3 попытки, чтобы угадать загаданное число от 1 до 9.");
    }

    public static int secNumber() {
        secretNumber = (int) (10 * Math.random());
        return (secretNumber);
    }

    public static void enterNumber() {
        int maxTries = 3;
        int currentTry = 1;
        Scanner sc = new Scanner(System.in);
        for (currentTry = 0; currentTry <= maxTries; currentTry++) {
            System.out.println("\nПопытка № " + currentTry);
            System.out.print("\nВведите целое число от 1-9: \n");
            int a = sc.nextInt();
            if ((1 <= a) && (a <= 10)) {
                System.out.println("Вы ввели: " + a);
            } else {
                System.out.println("Вы ввели неверно число.");
            }
            if (a == secretNumber) {
                System.out.println("Поздравляем! Вы выграли!");
                break;
            } else if (a > secretNumber) {
                System.out.println("Слишком большое число! Попробуй еще раз!");
            } else {
                System.out.println("Слишком маленькое число! Попробуй еще раз");
            }
        }
    }
    public static void  playAgain () {
        int answer = 0;
        System.out.println("Хотите сыграть еще? 1 - да, 2 - нет!");
        Scanner sc = new Scanner(System.in);
        answer = sc.nextInt();
        if (answer == 1) {
            gameIntro();
            secNumber();
            System.out.println(secretNumber);
            enterNumber();
            playAgain();
        } else {
            System.out.println("Спасибо за игру!");
        }
        sc.close();
    }
}
