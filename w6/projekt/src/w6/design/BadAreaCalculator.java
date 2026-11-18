package w6.design;

import w6.shapes.Circle;
import w6.shapes.Rectangle;
import w6.shapes.Shape;

public class BadAreaCalculator {                  // anti-pattern!
    static double area(Shape s) {
        if (s instanceof Circle c) {
            return Math.PI * c.getRadius() * c.getRadius();
        } else if (s instanceof Rectangle r) {
            return r.getWidth() * r.getHeight();
        }
        throw new IllegalArgumentException("Unknown shape: " + s.getName());
    }   // new shape = new branch here (and in every similar method)

    public static void main(String[] args) {
        System.out.println(area(new Rectangle(2, 3)));            // 6.0
        System.out.println(area(new w6.shapes.Triangle(4, 3)));   // exception
    }
}
