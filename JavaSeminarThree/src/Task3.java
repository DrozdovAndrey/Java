import java.util.ArrayList;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        List<String> planet = new ArrayList<>();
        planet.add("�����");
        planet.add("������");
        planet.add("����");
        planet.add("������");
        planet.add("������");
        planet.add("����");
        int count = 0;
        for (int i = 0; i < planet.size(); i++) {
            for (String s : planet) {
                if (planet.get(i).equals(s)) {
                    count++;
                }
            }
            System.out.printf("%s, %d\n", planet.get(i), count);
            count = 0;
        }
    }
}
