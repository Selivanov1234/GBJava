package homeworkthree;

import java.util.Random;
import java.util.Scanner;

/* 1. Написать программу, которая загадывает случайное число от 0 до 9, и пользователю дается 3 попытки угадать это число.
При каждой попытке компьютер должен сообщить больше ли указанное пользователем число чем загаданное, или меньше.
После победы или проигрыша выводится запрос – «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).
* */
public class GuessTheNumber {
    public static int secretNumber;
    public static void main(String[] args) {

        secretNumber();
        enterNumber();

        System.out.println(secretNumber());
    }
    public static int secretNumber () {
        secretNumber = (int) (10 *  Math.random());
        return (secretNumber);
    }
    public static int enterNumber () {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите целое число от 1-9.");
       // int a = sc.nextInt();
        if (sc.hasNextInt()) {
            System.out.println("Вы ввели: " + sc.nextInt());
        } else {
            System.out.println("Вы ввели неверно число.");
        }
        return sc.nextInt();
    }
    public static void compare
}
