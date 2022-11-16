package SeminarFour;

import java.util.LinkedList;
import java.util.Scanner;

/*
Реализовать консольное приложение, которое:

1. Принимает от пользователя строку вида

text~num

1. Нужно рассплитить строку по ~, сохранить text в связный список на позицию num.
2. Если введено print~num, выводит строку из позиции num в связном списке и удаляет её из списка.
Пример:
ter~1
Jiodf~2
Lsdf~3
 */
public class Task2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<String> ll = new LinkedList<>();
        String input = "";
        while (true){
            System.out.println("Input text:");
            input = sc.nextLine();
            if (input.equals("stop")) break;
            var element = input.split("~");
            if (element[0].equals("print")) {
                System.out.println(ll.get(Integer.parseInt(element[1])));
                ll.remove(Integer.parseInt(element[1]));
                System.out.println(ll);
            }else {
                ll.add(Integer.parseInt(element[1]), element[0]);
                System.out.println(ll);
            }
        }

    }
}
