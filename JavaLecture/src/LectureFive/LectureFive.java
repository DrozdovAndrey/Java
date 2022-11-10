package LectureFive;

import java.util.*;

public class LectureFive {
    public static void main(String[] args) {
        // HashMap
        Map<Integer, String> db = new HashMap<>();
        db.put(1, "one");
        System.out.println(db);
        db.put(2, "two");
        System.out.println(db);
        db.put(3, "three");
        System.out.println(db);
        db.put(31, "three one");
        System.out.println(db);
        db.put(13, "one three");
        System.out.println(db);
        db.put(null, "!null");
        System.out.println(db);
        db.put(null, null);
        System.out.println(db);
        db.putIfAbsent(1, "two");
        System.out.println(db);
        db.put(1, "one one");
        System.out.println(db);
        String x = db.get(1);
        System.out.println(x);
        db.remove(1);
        System.out.println(db);
        System.out.println(db.containsValue("two"));
        System.out.println(db.containsValue("five"));
        System.out.println(db.containsKey(1));
        System.out.println(db.containsKey(2));
        System.out.println(db.keySet());
        System.out.println(db.values());
        db.putIfAbsent(1, "one");
        System.out.println(db);
        for (var item : db.entrySet()
             ) {
            System.out.printf("[%d: %s]", item.getKey(), item.getValue());
        }
        Map<Integer, String> map1 = new HashMap<>();
        Map<Integer, String> map2 = new HashMap<>(9);
        Map<Integer, String> map3 = new HashMap<>(9, 1.0f);

        // TreeMap
        TreeMap<Integer, String> tMap = new TreeMap<>();
        System.out.println();
        tMap.put(1, "one");
        System.out.println(tMap);
        tMap.put(6, "six");
        System.out.println(tMap);
        tMap.put(4, "four");
        System.out.println(tMap);
        tMap.put(3, "three");
        System.out.println(tMap);
        tMap.put(2, "two");
        System.out.println(tMap);
        x = tMap.get(6);
        System.out.println(x);
        tMap.remove(3);
        System.out.println(tMap);
        System.out.println(tMap.descendingKeySet());
        System.out.println(tMap.descendingMap());
        System.out.println(tMap.tailMap(2));
        System.out.println(tMap.headMap(2));
        System.out.println(tMap.lastEntry());
        System.out.println(tMap.firstEntry());

        //LinkedHashMap
        Map<Integer, String> linkMap = new LinkedHashMap<>();
        linkMap.put(11, "one one");
        linkMap.put(1, "one");
        linkMap.put(2, "two");
        System.out.println(linkMap);
        Map<Integer, String> map = new HashMap<>();
        map.put(11, "one one");
        map.put(1, "one");
        map.put(2, "two");
        System.out.println(map);

        //HashTable
        Map<Integer, String> table = new Hashtable<>();
        table.put(11, "one one");
        table.put(1, "one");
        table.put(2, "two");
        table.put(3, "three");
        System.out.println(table);
//        table.put(null, "one");  java.lang.NullPointerException




    }
}
