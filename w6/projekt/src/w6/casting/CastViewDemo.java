package w6.casting;

import w6.shapes.Circle;
import w6.shapes.Shape;

public class CastViewDemo {
    public static void main(String[] args) {
        double d = 3.7;
        int i = (int) d;                  // primitive cast: a NEW value
        System.out.println(i);            // 3

        Circle circle = new Circle(1);
        Shape shape = (Shape) circle;     // reference cast: the SAME object
        System.out.println(shape == circle);                  // true
        System.out.println(shape.getClass().getSimpleName()); // Circle
    }
}
