package w6.design;

import w6.shapes.Circle;
import w6.shapes.Rectangle;
import w6.shapes.Shape;
import w6.shapes.Square;

public class ShapeFactory {
    public static Shape parse(String line) {      // returns the base type
        String[] p = line.split(" ");
        return switch (p[0]) {
            case "circle" -> new Circle(Double.parseDouble(p[1]));
            case "square" -> new Square(Double.parseDouble(p[1]));
            case "rect" -> new Rectangle(Double.parseDouble(p[1]),
                                         Double.parseDouble(p[2]));
            default -> throw new IllegalArgumentException("Unknown: " + p[0]);
        };
    }
}
