package OOP01.Robots;

public class Robot1 {
    /**
     * Уровень робота
     */
    private int level;
    /**
     * Имя робота
     */
    private String name;

    /**
     * Создание робота
     * @param name Имя робота !не должно начинаться с цифры
     * @param level Уровень робота
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
     * Метод включения системы
     */
    public void powerOn(){
        this.startBIOS();
        this.startOS();
        this.sayHi();
    }

    /**
     * метод выключения системы
     */
    public void powerOff(){
        this.sayBye();
        this.stopOS();
        this.stopBIOS();
    }
    /**
     * Загрузка BIOS
     */
    private void startBIOS(){
        System.out.println("Start BIOS...");
    }

    /**
     * Загрузка OS
     */
    private void startOS(){
        System.out.println("Start OS...");
    }

    /**
     * Приветствие
     */
    private void sayHi(){
        System.out.println("Hello world...");
    }

    /**
     * Выгрузка BIOS
     */
    private void stopBIOS(){
        System.out.println("Stop BIOS...");
    }
    /**
     * Выгрузка OS
     */
    private void stopOS(){
        System.out.println("Stop OS...");
    }
    /**
     * Прощание
     */
    private void sayBye(){
        System.out.println("Bye...");
    }

    /**
     * Работа
     */
    public void work(){
        System.out.println("Working...");
    }

    @Override
    public String toString() {
        return String.format("%s %d", this.name, this.level);
    }
}
