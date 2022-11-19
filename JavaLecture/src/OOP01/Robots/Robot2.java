package OOP01.Robots;

import java.util.ArrayList;

public class Robot2 {
    enum State{
        On, Off
    }
    private static int defaultIndex;
    private static ArrayList<String> names;

    static {
        defaultIndex = 1;
        names = new ArrayList<String>();
    }
    /**
     * ������� ������
     */
    private int level;
    /**
     * ��� ������
     */
    private String name;
    private State state;
    private Robot2(String name, int level){
        System.out.println(Character.isDigit(name.charAt(0)));
        if((name.isEmpty() || Character.isDigit(name.charAt(0)))
                || Robot2.names.indexOf(name) != -1){
            this.name = String.format("DefaultName_%d", defaultIndex++);
        }else {
            this.name = name;
        }
        Robot2.names.add(this.name);
        this.level = level;
        this.state = State.Off;
    }

//    public Robot2(String name){
//        System.out.println(Character.isDigit(name.charAt(0)));
//        if((name.isEmpty() || Character.isDigit(name.charAt(0)))
//                || Robot2.names.indexOf(name) != -1){
//            this.name = String.format("DefaultName_%d", defaultIndex++);
//        }else {
//            this.name = name;
//        }
//        Robot2.names.add(this.name);
//        this.level = 1;
//        this.state = State.Off;
//    }
//
//    public Robot2(){
//        this.name = String.format("DefaultName_%d", defaultIndex++);
//        Robot2.names.add(this.name);
//        this.level = 1;
//        this.state = State.Off;
//    }

    public Robot2(String name){
        this(name, 1);
    }

    public Robot2(){
        this("");
    }

    public void power(){
        if(this.state == State.Off){
            this.powerOn();
            this.state = State.On;
        }else {
            this.powerOff();
            this.state = State.Off;
        }
        System.out.println();
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
        if(this.state == State.On) {
            System.out.println("Working...");
        }
    }
    @Override
    public String toString() {
        return String.format("%s %d", this.name, this.level);
    }

}
