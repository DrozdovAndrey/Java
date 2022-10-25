package HomeWorkThree;

/*
Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее ариф. из этого списка
 */

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = fillRandom();
        System.out.println(numbers);
        System.out.println("min max");
        minMax(numbers);
        System.out.println("\naverage");
        System.out.println(average(numbers));


    }

    public static ArrayList fillRandom() {
        Random rnd = new Random();
        int listSize = rnd.nextInt(2, 21);
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        for (int i = 0; i < listSize; i++) {
            numbers.add(rnd.nextInt(0, 11));
        }
        return numbers;
    }
    public static void minMax (ArrayList<Integer> numbers){
        numbers.sort(Comparator.naturalOrder());
        int[] minMax = new int[]{numbers.get(0),numbers.get(numbers.size()-1)};
        for (int i: minMax){
            System.out.printf(" %d  ", i);
        }
    }
    public static double average (ArrayList<Integer> numbers){
        double average = 0;
        for (int i = 0; i < numbers.size(); i++) {
            average+=numbers.get(i);
        }
        average /= numbers.size();
        return average;
    }
}
