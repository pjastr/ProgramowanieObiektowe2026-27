package w6.design;

import java.util.List;
import w6.shapes.Circle;
import w6.shapes.Rectangle;
import w6.shapes.Shape;

public class TellDontAskDemo {
    static double totalAsk(List<Shape> shapes) {          // ask: anti-pattern
        double total = 0;
        for (Shape s : shapes) {
            if (s instanceof Circle c) {
                total += Math.PI * c.getRadius() * c.getRadius();
            } else if (s instanceof Rectangle r) {
                total += r.getWidth() * r.getHeight();
            }
        }
        return total;
    }

    static double totalTell(List<Shape> shapes) {         // tell: polymorphism
        double total = 0;
        for (Shape s : shapes) {
            total += s.area();
        }
        return total;
    }

    public static void main(String[] args) {
        List<Shape> shapes = List.of(new Circle(1), new Rectangle(2, 3));
        System.out.println(totalAsk(shapes) == totalTell(shapes));   // true
    }
}
