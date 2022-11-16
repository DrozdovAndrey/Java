package SeminarSix;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/*
1. Напишите метод, который заполнит массив из 1000 элементов случайными цифрами от 0 до 24.
2. Создайте метод, в который передайте заполненный выше массив и
с помощью Set вычислите процент уникальных значений в данном массиве и верните его в виде числа с плавающей запятой.
Для вычисления процента используйте формулу:
процент уникальных чисел = количество уникальных чисел * 100 / общее количество чисел в массиве.
 */
public class Task2 {
    public static Integer[] fillRandom () {
        Random rnd = new Random();
        Integer[] arr = new Integer[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt(0, 25);
        }
        return arr;
    }
    public static double percentUni(Integer[] arr){
        Set<Integer> set = new HashSet<>(Arrays.asList(arr));
        return (set.size()*100)/ arr.length;
    }
    public static void main(String[] args) {
        Integer [] arr = fillRandom();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        double count = percentUni(arr);
        System.out.println(count);

    }
}
