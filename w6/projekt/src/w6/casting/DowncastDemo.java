package w6.casting;

import w6.shapes.Circle;
import w6.shapes.Rectangle;
import w6.shapes.Shape;

public class DowncastDemo {
    public static void main(String[] args) {
        Shape s = new Circle(2);
        Circle c = (Circle) s;            // downcast: explicit
        System.out.println(c.getRadius());        // 2.0

        Shape r = new Rectangle(2, 3);
        Circle wrong = (Circle) r;        // compiles, but fails at runtime
        System.out.println(wrong.getRadius());
    }
}
