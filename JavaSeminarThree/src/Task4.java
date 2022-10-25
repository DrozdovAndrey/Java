import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        List list = new ArrayList<>();
        list.add(1);
        list.add("name1");
        list.add(11);
        list.add("name2");
        list.add(1111);
        list.add("name3");
        list.add(1111);
        list.add(1111);
        list.add(1111);
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) instanceof Integer) {
                list.remove(i);
                i--;
            }

            }
        System.out.println(list);
        }

    }

