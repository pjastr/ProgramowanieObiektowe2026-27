package w6.casting;

import w6.shapes.Circle;
import w6.shapes.Rectangle;
import w6.shapes.Shape;

public class ArrayCovarianceDemo {
    public static void main(String[] args) {
        Circle[] circles = new Circle[2];
        Shape[] shapes = circles;         // OK: Circle[] is a Shape[]

        shapes[0] = new Circle(1);        // OK
        shapes[1] = new Rectangle(2, 3);  // compiles, but at runtime:
                                          // ArrayStoreException
        // List<Shape> list = new ArrayList<Circle>();   // generics are invariant:
        // error: incompatible types: ArrayList<Circle> cannot be converted to List<Shape>
    }
}
