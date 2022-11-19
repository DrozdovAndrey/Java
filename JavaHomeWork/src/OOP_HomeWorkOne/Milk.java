package OOP_HomeWorkOne;

public class Milk extends Product{
    private double fatness;

    public Milk(String name){
        super(name);
    }

    public Milk(String name, double price){
        super(name, price);
    }

    public Milk(String name, double price, double fatness){
        super(name, price);
        this.fatness = fatness;
    }

    public double getFatness(){
        return this.fatness;
    }

    @Override
    public String toString() {
        return String.format("%s fatness: %.2f", super.toString(), fatness);
    }
}
