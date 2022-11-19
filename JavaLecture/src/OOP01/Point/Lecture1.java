package OOP01.Point;

public class Lecture1 {
    public static double distance (Point2D a, Point2D b){
        return Math.sqrt(Math.pow(a.getX() - b.getX(), 2) + Math.pow(a.getY() -b.getY(), 2));
    }
    public static void main(String[] args) {
        Point2D a = new Point2D(0, 2);
//        a.x = 0;
//        a.y = 2;
        System.out.println(a.getX());

        Point2D b = new Point2D();
        b.setX(0);
        b.setY(10);
        System.out.println(b.getY());
        System.out.println(distance(a,b));
    }
}
