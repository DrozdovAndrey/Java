package HomeWorkThree;
/*
Реализовать алгоритм сортировки слиянием
 */

public class Task1 {
    public static void main(String[] args) {
        int[] numbers = {5,8,4,1,9,3,5,7,2};
        mergeSort(numbers, numbers.length);
        for (int i: numbers){
            System.out.print(i);
        }

    }
    public static void mergeSort(int[] numbers, int size){
        if (size < 2) return;
        int middle = size/2;
        int[] left = new int[middle];
        int[] right = new int[size-middle];
        for (int i = 0; i < middle; i++) {
            left[i] = numbers[i];
        }
        for (int i = middle; i <size; i++) {
            right[i-middle] = numbers[i];
        }
        mergeSort(left, middle);
        mergeSort(right, size-middle);
        merge(numbers, left, right, middle, size-middle);
    }
    public static void merge(int[] numbers, int[] left, int[] right, int leftSize, int rightSize){
        int i = 0, j = 0, k = 0;
        while (i < leftSize && j < rightSize){
            if (left[i] <= right[j]) numbers[k++] = left[i++];
            else numbers[k++] = right[j++];
        }
        while (i < leftSize) numbers[k++] = left[i++];
        while (j < rightSize) numbers[k++] = right[j++];
    }
}
