package SeminarSix;

import java.util.*;

/*
1. —оздайте HashSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}. –аспечатайте содержимое данного множества.
2. —оздайте LinkedHashSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}. –аспечатайте содержимое данного множества.
3. —оздайте TreeSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}. –аспечатайте содержимое данного множества.
 */
public class Task1 {
    public static void main(String[] args) {
        Set <Integer> set1 = new HashSet<>(Arrays.asList(100,4,5,1,2,5,3,9));
        System.out.println(set1);
        Set <Integer> set2 = new LinkedHashSet<>(Arrays.asList(100,4,5,1,2,5,3,9));
        System.out.println(set2);
        Set <Integer> set3 = new TreeSet<>(Arrays.asList(100,4,5,1,2,5,3,9));
        System.out.println(set3);
    }

}
