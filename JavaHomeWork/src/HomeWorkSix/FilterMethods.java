package HomeWorkSix;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;


public class FilterMethods {

    public static void filters(Set<Notebook> notebooks){
        Scanner sc = new Scanner(System.in);
        Map<Integer, String> filter = new HashMap<>();
        filter.put(1, "os");
        filter.put(2, "display");
        filter.put(3, "processor");
        filter.put(4, "ssd");
        filter.put(5, "ram");
        filter.put(6, "video card");

        System.out.println("Choose filter:\n" +
                "1 - os, " +
                "2 - display, " +
                "3 - processor, " +
                "4 - ssd, " +
                "5 - ram, " +
                "6 - video card.");
        System.out.println("Your choice:");
        int input = sc.nextInt();
        if(filter.containsKey(input)){
            switch (input) {
                case 1 -> {
                    System.out.println("Mac - 1, Windows - 2, Linux -3");
                    System.out.println("Your choice:");
                    int inputOs = sc.nextInt();
                    Map<Integer, String> osFilter = new HashMap<>();
                    osFilter.put(1, "Mac");
                    osFilter.put(2, "Windows");
                    osFilter.put(3, "Linux");
                    Notebook.sortByOs(notebooks, osFilter.get(inputOs));
                }
                case 2 -> {
                    System.out.println("13 inch - 1, 15 inch - 2, 17 inch -3");
                    System.out.println("Your choice:");
                    int inputDisplay = sc.nextInt();
                    Map<Integer, Integer> displayFilter = new HashMap<>();
                    displayFilter.put(1, 13);
                    displayFilter.put(2, 15);
                    displayFilter.put(3, 17);
                    Notebook.sortByDisplay(notebooks, displayFilter.get(inputDisplay));
                }
                case 3 ->{
                    System.out.println("AMD - 1, Intel - 2, M1 - 3");
                    System.out.println("Your choice:");
                    int inputProcessor = sc.nextInt();
                    Map<Integer, String> processorFilter = new HashMap<>();
                    processorFilter.put(1, "AMD");
                    processorFilter.put(2, "Intel");
                    processorFilter.put(3, "M1");
                    Notebook.sortByProcessor(notebooks, processorFilter.get(inputProcessor));
                }
                case 4 -> {
                    System.out.println("1 tb - 1, 2 tb - 2, 4 tb - 4, 6 tb - 6, 8 tb - 8");
                    System.out.println("Your choice:");
                    int inputDisplay = sc.nextInt();
                    Map<Integer, Integer> ssdFilter = new HashMap<>();
                    ssdFilter.put(1, 1);
                    ssdFilter.put(2, 2);
                    ssdFilter.put(4, 4);
                    ssdFilter.put(6, 6);
                    ssdFilter.put(8, 8);
                    Notebook.sortBySSD(notebooks, ssdFilter.get(inputDisplay));
                }
                case 5 -> {
                    System.out.println("8 gb - 1, 16 gb - 2, 32 gb - 3, 64 gb - 4");
                    System.out.println("Your choice:");
                    int inputRam = sc.nextInt();
                    Map<Integer, Integer> ramFilter = new HashMap<>();
                    ramFilter.put(1,8);
                    ramFilter.put(2,16);
                    ramFilter.put(3,32);
                    ramFilter.put(4,64);
                    Notebook.sortByRAM(notebooks, ramFilter.get(inputRam));
                }
                case 6 ->{
                    System.out.println("AMD - 1, Intel - 2, M1 - 3, NVIDIA - 4");
                    System.out.println("Your choice:");
                    int inputVideoCard = sc.nextInt();
                    Map<Integer, String> videoCardFilter = new HashMap<>();
                    videoCardFilter.put(1, "AMD");
                    videoCardFilter.put(2, "Intel");
                    videoCardFilter.put(3, "M1");
                    videoCardFilter.put(4, "NVIDIA");
                    Notebook.sortByVideoCard(notebooks, videoCardFilter.get(inputVideoCard));
                }

            }
        }
    }




}
