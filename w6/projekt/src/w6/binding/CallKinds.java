package w6.binding;

import java.util.List;
import w6.shapes.Circle;
import w6.shapes.Shape;

public class CallKinds {
    static int twice(int x) {
        return 2 * x;
    }

    void run(Shape s, List<Shape> list) {
        Shape c = new Circle(1);   // invokespecial  Circle.<init>
        s.area();                  // invokevirtual  Shape.area
        twice(3);                  // invokestatic   CallKinds.twice
        list.size();               // invokeinterface List.size
        super.toString();          // invokespecial  Object.toString
    }
}
