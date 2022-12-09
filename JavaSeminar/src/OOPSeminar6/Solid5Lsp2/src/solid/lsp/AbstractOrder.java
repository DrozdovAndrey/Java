package OOPSeminar6.Solid5Lsp2.src.solid.lsp;

public abstract class AbstractOrder {
    protected int price;
    protected int qnt;

    public AbstractOrder(int price, int qnt) {
        this.price = price;
        this.qnt = qnt;
    }

    public abstract int getAmount();
    @Override
    public String toString() {
        return String.format("Quantity = %d, Price = %d", qnt, price);
    }

}
