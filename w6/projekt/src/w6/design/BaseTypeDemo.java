package w6.design;

import java.util.ArrayList;
import java.util.List;
import w6.shapes.Shape;

public class BaseTypeDemo {
    static Shape largest(List<Shape> shapes) {    // parameter: base type
        Shape best = shapes.getFirst();
        for (Shape s : shapes) {
            if (s.area() > best.area()) {
                best = s;
            }
        }
        return best;
    }

    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();   // variable: base type
        for (String line : List.of("circle 1", "rect 2 3", "square 2")) {
            shapes.add(ShapeFactory.parse(line));
        }
        System.out.println(largest(shapes));      // rectangle: area = 6.0
    }
}
