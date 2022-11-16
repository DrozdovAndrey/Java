package SeminarFour;

import java.util.LinkedList;
import java.util.Stack;

/*
1) Написать метод, который принимает массив элементов, помещает их в стэк и выводит на консоль содержимое стэка.

2) Написать метод, который принимает массив элементов, помещает их в linkedList и затем выводит его.
 */
public class Task3 {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6};
        addStack(arr);
        System.out.println();
        addLinkedList(arr);
    }
    public static void addStack(int[] arr){
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            st.push(arr[i]);
        }
        while (!st.empty()){
            System.out.print(st.pop()+" ");
        }
//        for (int i = st.size(); i > 0; i--) {
//            System.out.print(st.pop() + " ");
//        }
    }
    public static void addLinkedList(int[] arr){
        LinkedList<Integer> ll = new LinkedList<>();
        for (int i = 0; i < arr.length; i++) {
            ll.push(arr[i]);
        }
        System.out.println(ll);
    }
}
