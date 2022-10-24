import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class LectureThree {
    public static void main(String[] args) {
        //Object
//        Object o =1; GetType(o); //java.lang.Integer
//        o = 1.2; GetType(o); //java.lang.Integer
//        System.out.println(Sum(1,2));
//        System.out.println(Sum(1.0,2));
//        System.out.println(Sum(1,2.0));
//        System.out.println(Sum(1.2,2.1));
        //Collection
        //list
//        ArrayList<Integer> list1 = new ArrayList<>();
//        ArrayList<Integer> list2 = new ArrayList<>();
//        ArrayList<Integer> list3 = new ArrayList<>(10);
//        ArrayList<Integer> list4 = new ArrayList<>(list3);
//        ArrayList list = new ArrayList();
//        list.add(2809);
//        list.add("string line"); //так можно, но лучше использовать явную типизацию
//        for (Object o: list){
//            System.out.println(o);
//        }
//        ArrayList<Integer> list5 = new ArrayList<Integer>();
//        list5.add(2809);
//        list5.add(123);
////        list5.add("string line");
//        //a теперь нельзя
//        for (Object o: list5){
//            System.out.println(o);
//        }
//        int day = 29;
//        int month = 9;
//        int year = 1990;
//        Integer[] date = {day, month, year};
//        List<Integer> d = Arrays.asList(date);
//        System.out.println(d);

//        StringBuilder day = new StringBuilder("28");
//        StringBuilder month = new StringBuilder("9");
//        StringBuilder year = new StringBuilder("1990");
//        StringBuilder[] date = {day, month, year};
//        List<StringBuilder> d = Arrays.asList(date);
//        System.out.println(d);
//        date[1] = new StringBuilder("09");
//        System.out.println(d);

//        Character value = null;
//        List<Character> list1 = List.of('a','n','d','r','e','y');
//        System.out.println(list1);
////        list1.remove(1);
////        выкенет ошибку
//        List<Character> list2 = List.copyOf(list1);
        List<Integer> list = List.of(1,12,123,1234,12345);
        for (int item: list) {
            System.out.println(item);
        }
        Iterator<Integer> col = list.iterator();
        while (col.hasNext()){
            System.out.println(col.next());
//            col.next();
//            col.remove();
        }





    }
    static void GetType(Object obj){
        System.out.println(obj.getClass().getName());
    }
    static Object Sum(Object a, Object b){
        if(a instanceof Double && b instanceof Double){
            return (Object) ((Double)a + (Double) b);
        }else if (a instanceof Integer && b instanceof Integer){
            return (Object) ((Integer)a + (Integer) b);
        }else return 0;
    }
}