package HomeWorkFour;

import java.util.LinkedList;
import java.util.Scanner;

/*
–еализуйте очередь с помощью LinkedList со следующими методами:
enqueue() - помещает элемент в конец очереди,
dequeue() - возвращает первый элемент из очереди и удал€ет его,
first() - возвращает первый элемент из очереди, не удал€€.
 */
public class Task2 {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("Choose e - enqueue, d - dequeue, f - first, s - stop:");
            String input = sc.nextLine();
            if (input.equals("s")) break;
            if (input.equals("e")) {
                System.out.println("Input element:");
                int eInput = sc.nextInt();
                enqueue(ll, eInput);
                System.out.println(ll);
            }
            if (input.equals("d")) {
                System.out.println(dequeue(ll));
                System.out.println(ll);
            }
            if (input.equals("f")) {
                System.out.println(first(ll));
                System.out.println(ll);
            }
        }
    }
    public static void enqueue(LinkedList<Integer> ll, int a){
        ll.addLast(a);
    }
    public static int dequeue (LinkedList<Integer> ll){
        return ll.removeFirst();
    }
    public static int first (LinkedList<Integer> ll){
        return ll.peekFirst();
    }

}
