package OOP05.Ex001Calc.View;

import java.util.Scanner;

public class View {


    public int getValue(String title) {
        Scanner in = new Scanner(System.in);
        System.out.printf("%s", title);
        return in.nextInt();
    }
    public String getCommand(String title) {
        Scanner in = new Scanner(System.in);
        System.out.printf("%s", title);
        return in.nextLine();
    }


    // print(f'{title} = {data}')
    public void print(int data, String title) {
        System.out.printf("%s %d\n", title, data);
    }
}
