package w6.patterns;

import w6.shapes.Circle;
import w6.shapes.Shape;

public class PatternScopeDemo {
    static String radiusInfo(Shape s) {
        if (s instanceof Circle c) {      // test + cast + declaration
            return "r = " + c.getRadius();
        }
        return "not a circle";            // c is not in scope here
    }

    static String nameOf(Object o) {
        if (!(o instanceof Shape s)) {
            return "not a shape";
        }
        return s.getName();               // s in scope: flow scoping
    }

    static boolean isBigCircle(Shape s) {
        return s instanceof Circle c && c.getRadius() > 10;
        // s instanceof Circle c || c.getRadius() > 10
        // error: cannot find symbol c
    }

    public static void main(String[] args) {
        System.out.println(radiusInfo(new Circle(3)));     // r = 3.0
        System.out.println(nameOf("text"));                // not a shape
        System.out.println(nameOf(new Circle(1)));         // circle
        System.out.println(isBigCircle(new Circle(20)));   // true
    }
}
