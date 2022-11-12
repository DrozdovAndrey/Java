package HomeWorkFive;


import java.util.*;

/*
Реализуйте структуру телефонной книги с помощью HashMap,
 учитывая, что 1 человек может иметь несколько телефонов.
 */
public class Task1 {
    public static void main(String[] args) {
        Map<ArrayList<String>, ArrayList<Integer>> phoneBook = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        addContact(phoneBook, getName(sc), getPhone(sc));
        System.out.println("add another contact or view all?(y/n/v)");
        while (true){
            String input = sc.next();
            if(input.equals("n")) break;
            if (input.equals("y")){
                addContact(phoneBook, getName(sc), getPhone(sc));
                System.out.println("add another contact or view all?(y/n/v)");
            }
            if(input.equals("v")){
                System.out.println(phoneBook);
                System.out.println("add another contact or view all?(y/n/v)");
            }

        }
        System.out.println(phoneBook);
        sc.close();


    }
    public static ArrayList<String> getName(Scanner sc){
        ArrayList arrNames = new ArrayList<>(2);
        System.out.println("Input name");
        String name = sc.nextLine();
        arrNames.add(name);
        System.out.println("Input surname");
        String surname = sc.nextLine();
        arrNames.add(surname);
        return arrNames;
    }
    public static ArrayList<Integer> getPhone (Scanner sc){
        ArrayList arrPhones = new ArrayList<>(4);
        System.out.println("Input phone number");
        int phone = sc.nextInt();
        arrPhones.add(phone);
        System.out.println("add another number?(Y/N)");
        while (true){
            String input = sc.next();
            if (input.equals("n")) break;
            if (input.equals("y")) {
                System.out.println("Input phone number");
                phone = sc.nextInt();
                arrPhones.add(phone);
                System.out.println("add another number?(Y/N)");
            }
        }
        return arrPhones;
    }
    public static void addContact(Map<ArrayList<String>, ArrayList<Integer>> phoneBook, ArrayList<String> name, ArrayList<Integer> phone){
        phoneBook.put(name,phone);
    }
}
