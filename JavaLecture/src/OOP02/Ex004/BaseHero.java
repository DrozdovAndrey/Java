package OOP02.Ex004;

import java.util.Random;

public abstract class BaseHero {
    public BaseHero(String name, int hp) {
        System.out.println("������ BaseHero(String name, int hp)");
    }

    public BaseHero() {
        this("", 0);
        System.out.println("������ BaseHero()");
    }
}
