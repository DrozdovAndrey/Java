package OOP01.Robots;

public class Program {
    public static void main(String[] args) {
//        Robot1 robot1 = new Robot1("name_1", 1);
//
//        System.out.printf("%s $d", robot1.getName(), robot1.getLevel());
//        robot1.powerOn();
//        robot1.work();
//        robot1.powerOff();

        Robot2 robot2 = new Robot2("name_3");
        System.out.println("---------------------");
        System.out.println(robot2);
        robot2.power();
        robot2.work();
        robot2.power();
        robot2.work();

        robot2.power();
    }
}
