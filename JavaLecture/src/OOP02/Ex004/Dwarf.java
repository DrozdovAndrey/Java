package OOP02.Ex004;


public class Dwarf extends Druid {
    public Dwarf(String name, int hp) {
        super();
        System.out.println("������ Dwarf(String name, int hp)");
    }

    public Dwarf() {
        this("", 0);
        System.out.println("������ Dwarf()");
    }
}
