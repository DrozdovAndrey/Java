package HomeWorkSix;


import java.util.Set;

/*
�������� ��� ���������� ������ ������� ��� �������� ������� - �������� ���� � ������. ����������� � java.
������� ��������� ���������.
�������� �����, ������� ����� ����������� � ������������ �������� ���������� � ������� ��������, ���������� �������.
�������� ���������� ����� ������� � Map.
��������: �������� �����, ��������������� ������������ ��������:
1 - ���
2 - ����� ��
3 - ������������ �������
4 - ���� �

����� ����� ��������� ����������� �������� ��� ��������� ��������� - ��������� ��������� ���������� ����� ����� � Map.

������������� �������� �� ��������������� ��������� � ������� ���������� �� ��������.
 */
public class Notebook {
    int id;
    String name;
    String os;
    int ram;
    String processor;
    int display;
    int ssd;
    String videoCard;
    String bestFor;

    public Notebook(int id, String name, int display, String os, String processor, int ram, String videoCard, int ssd){
        this.id = id;
        this.name = name;
        this.display = display;
        this.os = os;
        this.ram = ram;
        this.processor = processor;
        this.videoCard = videoCard;
        this.ssd = ssd;


    }


    public static void sortByOs(Set<Notebook> notebooks, String osFilter){
        int count = 1;
        for (Notebook nb: notebooks) {
            if (nb.os.contains(osFilter)){
                System.out.print(count + " option:\n");
                System.out.println(nb);
                count++;
            }
        }
    }
    public static void sortByDisplay(Set<Notebook> notebooks, int osFilter){
        int count = 1;
        for (Notebook nb: notebooks) {
            if (nb.display == osFilter){
                System.out.print(count + " option:\n");
                System.out.println(nb);
                count++;
            }
        }
    }
    public static void sortByProcessor(Set<Notebook> notebooks, String osFilter){
        int count = 1;
        for (Notebook nb: notebooks) {
            if (nb.processor.contains(osFilter)){
                System.out.print(count + " option:\n");
                System.out.println(nb);
                count++;
            }
        }
    }
    public static void sortBySSD(Set<Notebook> notebooks, int osFilter){
        int count = 1;
        for (Notebook nb: notebooks) {
            if (nb.ssd == osFilter){
                System.out.print(count + " option:\n");
                System.out.println(nb);
                count++;
            }
        }
    }
    public static void sortByRAM(Set<Notebook> notebooks, int osFilter){
        int count = 1;
        for (Notebook nb: notebooks) {
            if (nb.ram == osFilter){
                System.out.print(count + " option:\n");
                System.out.println(nb);
                count++;
            }
        }
    }
    public static void sortByVideoCard(Set<Notebook> notebooks, String osFilter){
        int count = 1;
        for (Notebook nb: notebooks) {
            if (nb.videoCard.contains(osFilter)){
                System.out.print(count + " option:\n");
                System.out.println(nb);
                count++;
            }
        }
    }

    @Override
    public String toString() {
        return String.format("id: %d\nname: %s\ndisplay: %d " +
                "inch\nos: %s\nprocessor: %s\nvideo card: " +
                "%s\nssd: %d tb\n",
                id, name, display, os, processor, videoCard, ssd);
    }
}
