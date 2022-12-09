package OOPSeminar6.Solid1Srp1.src.solid.srp;

public class FigureManager {
    private int zoom;

    public FigureManager(int zoom) {
        this.zoom = zoom;
    }

    public void draw(Square square) {
        int side = square.getSide() * zoom;
        for (int i = 0; i < side; i++) {
            System.out.print("*");
        }
        System.out.println();
        for (int i = 0; i < side; i++) {
            System.out.print("*");
            for (int j = 1; j < side - 1; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }
        for (int i = 0; i < side; i++) {
            System.out.print("*");
        }
    }
}

