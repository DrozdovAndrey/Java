package OOP01.Point;

/**
 * это точка 2D
 */
public class Point2D {
    private int x,y;

    /**
     * это конструктор
     * @param valueX это координата x
     * @param valueY это координата y
     */
    public Point2D(int valueX, int valueY){
        this.x = valueX;
        this.y = valueY;
    }
    public Point2D(int value){
        this(value, value);
    }
    public Point2D(){
        this(0);
    }
//    public Point2D(){
//        this.x = 0;
//        this.y = 0;
//    }
//    public Point2D(int value){
//        this.x = value;
//        this.y = value;
//    }

    private String getInfo(){
        return String.format("x: %d y:%d", x, y);
    }

    @Override
    public String toString() {
        return getInfo();
    }

    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public void setX(int value){
        this.x = value;
    }
    public void setY(int value){
        this.y = value;
    }
}
