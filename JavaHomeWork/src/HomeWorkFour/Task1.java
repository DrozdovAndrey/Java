package HomeWorkFour;
/*
Пусть дан LinkedList с несколькими элементами.
Реализуйте метод, который вернет “перевернутый” список.
 */

import java.util.LinkedList;

public class Task1 {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(1);
        ll.add(5);
        ll.add(2);
        ll.add(7);
        System.out.println(ll);
        System.out.println(reverse(ll));
    }
    public static LinkedList<Integer> reverse (LinkedList<Integer> ll){
        LinkedList<Integer> llRev = new LinkedList<>();
        int size = ll.size();
        for (int i = 0; i < size; i++) {
            llRev.addFirst(ll.pollFirst());
        }
        return llRev;
    }
}
