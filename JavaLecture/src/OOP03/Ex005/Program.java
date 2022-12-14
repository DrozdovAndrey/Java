package OOP03.Ex005;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Program {
    public static void main(String[] args) {

        Random r = new Random();

        // #region Collections.sort(numbers);
//         List<Integer> numbers = new ArrayList<>();
//         for (int i = 0; i < 10; i++) {
//         numbers.add(r.nextInt(1,20));
//         }
//
//         System.out.println(numbers);
//         Collections.sort(numbers);
//         System.out.println(numbers);
        // #endregion

        // #region Comparable<Worker>
//         List<Worker> db = new ArrayList<>();
//         for (int i = 0; i < 5; i++) {
//         db.add(new Worker("Name " + i, "FamilyName " + i, r.nextInt(18,31),
//         r.nextInt(10000)));
//         }
//         System.out.println(db);
//
//         Collections.sort(db);
//        // Array.sort(...)
//
//         System.out.println(db);

        // #endregion

        // #region Comparable<Worker>

//         List<Worker> db = new ArrayList<>();
//         for (int i = 0; i < 5; i++) {
//             db.add(new Worker("Name " + i, "FamilyName " + i, r.nextInt(18, 31), r.nextInt(10000)));
//         }
//         System.out.println(db);
//
//         db.sort(new AgeComparator());
//
//         System.out.println(db);

        // #endregion

        //#region

        Worker w1 = new Worker("Имя", "Фамилия", 20, 20);
        Worker w2 = new Worker("Имя", "Фамилия", 21, 20);
        System.out.println(w1.compareTo(w2));

        //#endregion

    }
}
