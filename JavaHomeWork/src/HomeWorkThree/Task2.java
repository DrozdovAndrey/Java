package HomeWorkThree;

/*
Пусть дан произвольный список целых чисел, удалить из него четные числа
 */

import java.util.ArrayList;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = fillRandom();
        System.out.println(numbers);
        removeEven(numbers);
        System.out.println(numbers);

    }
    public static ArrayList fillRandom (){
        Random rnd = new Random();
        int listSize = rnd.nextInt(2,21);
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        for (int i = 0; i < listSize; i++) {
            numbers.add(rnd.nextInt(0,11));
        }
        return numbers;
    }
    public static ArrayList removeEven(ArrayList<Integer> numbers){
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i)%2 == 0) {
                numbers.remove(i);
                i--;
            }

        }
        return numbers;
    }
}
