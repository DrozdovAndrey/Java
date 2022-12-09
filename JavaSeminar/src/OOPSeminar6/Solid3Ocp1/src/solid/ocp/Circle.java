package OOPSeminar6.Solid3Ocp1.src.solid.ocp;

import OOPSeminar6.OOP_Lesson6_Solid.Solid3Ocp1.src.solid.Main;

public class Circle implements Shape{
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public double getArea() {
        return Math.PI*Math.pow(getRadius(),2);
    }
}
