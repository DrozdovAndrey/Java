package OOP01.Robots;

public class Robot1 {
    /**
     * ������� ������
     */
    private int level;
    /**
     * ��� ������
     */
    private String name;

    /**
     * �������� ������
     * @param name ��� ������ !�� ������ ���������� � �����
     * @param level ������� ������
     */
    public Robot1(String name, int level){
        this.name = name;
        this.level = level;
    }
    public int getLevel(){
        return this.level;
    }
    public String getName(){
        return this.name;
    }

    /**
     * ����� ��������� �������
     */
    public void powerOn(){
        this.startBIOS();
        this.startOS();
        this.sayHi();
    }

    /**
     * ����� ���������� �������
     */
    public void powerOff(){
        this.sayBye();
        this.stopOS();
        this.stopBIOS();
    }
    /**
     * �������� BIOS
     */
    private void startBIOS(){
        System.out.println("Start BIOS...");
    }

    /**
     * �������� OS
     */
    private void startOS(){
        System.out.println("Start OS...");
    }

    /**
     * �����������
     */
    private void sayHi(){
        System.out.println("Hello world...");
    }

    /**
     * �������� BIOS
     */
    private void stopBIOS(){
        System.out.println("Stop BIOS...");
    }
    /**
     * �������� OS
     */
    private void stopOS(){
        System.out.println("Stop OS...");
    }
    /**
     * ��������
     */
    private void sayBye(){
        System.out.println("Bye...");
    }

    /**
     * ������
     */
    public void work(){
        System.out.println("Working...");
    }

    @Override
    public String toString() {
        return String.format("%s %d", this.name, this.level);
    }
}
