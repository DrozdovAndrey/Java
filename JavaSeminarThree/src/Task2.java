import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        Random rnd = new Random();
        for (int i = 0; i < 10; i++) {
            list.add(rnd.nextInt(1,11));
        }
        System.out.println(list);
        list.sort(Comparator.naturalOrder());
        System.out.println(list);
    }
}
