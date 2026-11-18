package w6.patterns;

import w6.shapes.Circle;
import w6.shapes.Rectangle;
import w6.shapes.Shape;
import w6.shapes.Square;

public class InstanceofDemo {
    static void printRadius(Shape s) {
        if (s instanceof Circle) {        // check first...
            Circle c = (Circle) s;        // ...then cast
            System.out.println("r = " + c.getRadius());
        } else {
            System.out.println("not a circle");
        }
    }

    public static void main(String[] args) {
        printRadius(new Circle(2));       // r = 2.0
        printRadius(new Square(2));       // not a circle
        printRadius(null);                // not a circle

        Shape s = new Square(2);
        System.out.println(s instanceof Square);       // true
        System.out.println(s instanceof Rectangle);    // true
        System.out.println(s instanceof Shape);        // true
        System.out.println(s instanceof Object);       // true
        System.out.println(s instanceof Circle);       // false

        Square sq = new Square(2);
        // System.out.println(sq instanceof Circle);   // error: incompatible
                                                       // types: Square cannot
                                                       // be converted to Circle
        System.out.println(s.getClass() == Rectangle.class);   // false
        System.out.println(s.getClass() == Square.class);      // true
    }
}
