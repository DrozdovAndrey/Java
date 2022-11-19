package OOP_HomeWorkOne;

public class PopDrink extends Product {
    private int ccal;
    private String sugar;

    public PopDrink(String name){
        super(name);
    }

    public PopDrink(String name, double price){
        super(name, price);
    }

    public PopDrink(String name, double price, int ccal, String sugar){
        super(name, price);
        this.ccal = ccal;
        if(sugar.contains("y")) this.sugar = "regular sugar";
        if (sugar.contains("n")) this.sugar = "no sugar";
    }

    public int getCcal(){
        return this.ccal;
    }

    public String getSugar(){
        return this.sugar;
    }

    @Override
    public String toString() {
        return String.format("%s ccal: %d %s", super.toString(), ccal, sugar);
    }
}
