package HomeWorkSix;

import java.util.HashSet;
import java.util.Set;

/*
Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
Создать множество ноутбуков.
Написать метод, который будет запрашивать у пользователя критерий фильтрации и выведет ноутбуки, отвечающие фильтру.
Критерии фильтрации можно хранить в Map.
Например: “Введите цифру, соответствующую необходимому критерию:
1 - ОЗУ
2 - Объем ЖД
3 - Операционная система
4 - Цвет …

Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.

Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
 */
public class HomeWorkSix {
    public static void main(String[] args) {
        Notebook nb1 = new Notebook(1, "HP 15fgdfhj", 17,
                "Windows", "AMD Ryzen Threadripper PRO 5995WX", 16,"NVIDIA GeForce RTX 4090",
                4);

        Notebook nb2 = new Notebook(2, "Huawei 13uuuggg", 13,
                "Windows", "Intel Xeon Platinum 8380",32, "NVIDIA GeForce RTX 3080 Ti",
                1);

        Notebook nb3 = new Notebook(3, "HP 15uuddd", 15,
                "Windows", "Intel Core i9-13900KF", 8,"NVIDIA Titan RTX",
                1);

        Notebook nb4 = new Notebook(4, "AlienWare 15power", 15,
                "Linux", "AMD EPYC 7763", 16,"AMD Radeon RX 5700",
                6);

        Notebook nb5 = new Notebook(5, "Lenovo", 17,
                "Windows", "Intel Xeon Gold 6314U", 32,"AMD Radeon RX 6950 XT",
                2);

        Notebook nb6 = new Notebook(6, "MacBook Pro 15", 15,
                "MacOS", "M1 pro", 64,"M1 pro",
                4);

        Notebook nb7 = new Notebook(7, "MacBook Pro 13", 13,
                "MacOS", "M1", 32, "M1",
                8);

        Notebook nb8 = new Notebook(8, "Lenovo 17pk", 17,
                "Linux", "Intel® Core™ i9 12900H 12th Gen one", 16,"Intel® Iris® X? Graphics Card",
                1);

        Set<Notebook> notebooks = new HashSet<>();
        notebooks.add(nb1);
        notebooks.add(nb2);
        notebooks.add(nb3);
        notebooks.add(nb4);
        notebooks.add(nb5);
        notebooks.add(nb6);
        notebooks.add(nb7);
        notebooks.add(nb8);
//        System.out.println(notebooks);
        FilterMethods.filters(notebooks);

    }

}
