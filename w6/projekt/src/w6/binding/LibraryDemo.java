package w6.binding;

import java.util.List;
import w6.shapes.Circle;

public class LibraryDemo {
    public static void main(String[] args) {
        Object[] items = { "text", 42, new Circle(1), List.of(1, 2) };
        for (Object o : items) {
            System.out.println(o);        // String.valueOf(o) -> o.toString()
        }
    }
}
