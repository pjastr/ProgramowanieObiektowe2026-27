package w6.casting;

import w6.shapes.Circle;
import w6.shapes.Shape;

public class UpcastDemo {
    public static void main(String[] args) {
        Circle circle = new Circle(2);
        Shape shape = circle;             // upcast: implicit and always safe
        Object object = circle;           // also an upcast

        System.out.println(shape.getName());      // circle
        System.out.println(shape.area());         // 12.566...: Circle.area()
        // shape.getRadius();             // error: cannot find symbol
        System.out.println(object == circle);     // true: the same object
    }
}
