package ru_geekbrains_lesson3;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Ваша задача угадать число");
        for (int i = 10; i <= 30; i+=10){
            playLevel(i);
        }
        System.out.println("Вы выиграли!!!"); // добавил чтобы потестить гит, добавлю еще что то чтобы закомитить
        System.out.println("Вы выиграли в 3х раундах!!!");
        scanner.close();

    }
    public static void playLevel(int range) {
        int number = (int) (Math.random() * range); // Math.random генерирует случайное число, но дробное, конструкцией
        // (int) мы обрубаем дробь и оставляем только целочисленную часть
        // умножая на range мы генерируем число от 0 до range
        while (true) {
            System.out.println("Угадайте число от 0 до " + range);
            int input_number = scanner.nextInt();
            if (input_number == number) {
                System.out.println("Вы угадали!");
                break;
            } else if (input_number > number) {
                System.out.println("Ваше число больше");
            } else {
                System.out.println("Ваше число меньше");
            }

        }
    }
}
