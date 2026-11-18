package w6.casting;

import w6.shapes.Circle;
import w6.shapes.Rectangle;
import w6.shapes.Shape;
import w6.shapes.Square;

public class ClassObjectDemo {
    static int count(Shape[] shapes, Class<?> type) {
        int n = 0;
        for (Shape s : shapes) {
            if (type.isInstance(s)) {     // like "s instanceof type"
                n++;
            }
        }
        return n;
    }

    public static void main(String[] args) {
        Shape[] shapes = { new Circle(1), new Rectangle(2, 3), new Square(2) };
        System.out.println(count(shapes, Rectangle.class));   // 2
        System.out.println(count(shapes, Shape.class));       // 3

        Circle c = Circle.class.cast(shapes[0]);   // like "(Circle) shapes[0]"
        System.out.println(c.getRadius());         // 1.0
    }
}
