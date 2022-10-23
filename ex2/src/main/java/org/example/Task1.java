package org.example;

//Реализуйте алгоритм сортировки пузырьком числового массива,
// результат после каждой итерации запишите в лог-файл.
//Начальный массив: [3, 1, 5, 0, 7, 9, 8]


import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Task1 {
    public static int[] bubbleSort(int[] arr) throws Exception {
        Logger logger = Logger.getLogger(Task1.class.getName());
        logger.setLevel(Level.INFO);
        FileHandler fh = new FileHandler("log.txt");
        logger.addHandler(fh);
        SimpleFormatter xml = new SimpleFormatter();
        fh.setFormatter(xml);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    logger.log(Level.INFO, "element "+" "+ arr[j] +" "+ "has to change"+" "+arr[j+1]);
                }
            }
        }
        return arr;
    }
    public static void printArr(int[] arr){
        for (int item: arr) {
            System.out.print(item);
        }
    }
    public static void main(String[] args) throws Exception {
        int[] arr = new int[]{3, 1, 5, 0, 7, 9, 8};
        printArr(bubbleSort(arr));
    }
}
