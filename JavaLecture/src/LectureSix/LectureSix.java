package LectureSix;

import java.util.*;

public class LectureSix {
    public static void main(String[] args) {
        /*
        HashSet
        isEmpty() - проверка на пустоту.
        add(V) - добавление элемента в коллекцию
        remove(v) - удаление элемента из коллекции
        contains(v) - проверка на включение элемента в коллекции
        clear() - удаление всех элементов
        size() - возвращает кол-во эл-тов коллекции
         */
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(12);
        set.add(123);
        set.add(1234);
        set.add(1234);
        System.out.println(set);
        set.contains(12);
        set.add(null);
        System.out.println(set.size());
        System.out.println(set);
        set.remove(12);
        for (var item : set) {
            System.out.println(item);
        }
        set.clear();
        System.out.println(set);
        /*
        addAll(col) - объединение множеств
        retainAll(col) - пересечение множеств
        removeAll(col) - разность множеств
         */
        var a = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
        var b = new HashSet<>(Arrays.asList(2, 3, 5, 7, 11, 13, 17));
        var u = new HashSet<Integer>(a);
        u.addAll(b);
        var r = new HashSet<Integer>(a);
        r.retainAll(b);
        var s = new HashSet<Integer>(b);
        s.removeAll(a);
        System.out.println(a);
        System.out.println(b);
        System.out.println(u);
        System.out.println(r);
        System.out.println(s);
        boolean res = a.addAll(b);
        System.out.println(res);
        /*
        first()
        last()
        headSet(E)
        tailSet(E)
        subSet(E1,E2)
         */
        //TreeSet
        var a1 = new TreeSet<>(Arrays.asList(1,7,2,3,6,4,5));
        var b1 = new TreeSet<>(Arrays.asList(13,3,17,7,2,11,5));
        System.out.println(a1);
        System.out.println(b1);
        System.out.println(a1.headSet(4));
        System.out.println(a1.tailSet(4));
        System.out.println(a1.subSet(3,5));
        /*
        LinkedGashSet
        в основе HashMap
        помнит порядок
        isEmpty() - проверка на пустоту.
        add(V) - добавление элемента в коллекцию
        remove(v) - удаление элемента из коллекции
        contains(v) - проверка на включение элемента в коллекции
        clear() - удаление всех элементов
        size() - возвращает кол-во эл-тов коллекции
         */
        var a2 = new LinkedHashSet<>(Arrays.asList(1,7,2,3,6,4,5));
        var b2 = new LinkedHashSet<>(Arrays.asList(12,3,17,7,2,11,5));
        a2.add(28);
        System.out.println(a2);
        System.out.println(b2);
    }
}
