package OOP03.Ex007;

import java.util.Objects;

public abstract class Ingredient {
    public String brand;

    public Ingredient(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return brand;
    }

    @Override
    public boolean equals(Object obj) {
        Ingredient t = (Ingredient) obj;
        return Objects.equals(t.brand, this.brand);
    }
}
