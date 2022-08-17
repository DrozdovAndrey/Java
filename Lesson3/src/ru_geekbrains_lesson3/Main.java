package ru_geekbrains_lesson3;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("���� ������ ������� �����");
        for (int i = 10; i <= 30; i+=10){
            playLevel(i);
        }
        System.out.println("�� ��������!!!"); // ������� ����� ��������� ���, ������� ��� ��� �� ����� ����������
        System.out.println("�� �������� � 3� �������!!!");
        scanner.close();

    }
    public static void playLevel(int range) {
        int number = (int) (Math.random() * range); // Math.random ���������� ��������� �����, �� �������, ������������
        // (int) �� �������� ����� � ��������� ������ ������������� �����
        // ������� �� range �� ���������� ����� �� 0 �� range
        while (true) {
            System.out.println("�������� ����� �� 0 �� " + range);
            int input_number = scanner.nextInt();
            if (input_number == number) {
                System.out.println("�� �������!");
                break;
            } else if (input_number > number) {
                System.out.println("���� ����� ������");
            } else {
                System.out.println("���� ����� ������");
            }

        }
    }
}
