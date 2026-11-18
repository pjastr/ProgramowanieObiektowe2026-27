package w6.equality.broken;

import java.util.HashSet;
import java.util.List;

public class OverloadPitfallDemo {
    public static void main(String[] args) {
        Point p = new Point(1, 2);
        Point q = new Point(1, 2);
        Object o = q;

        System.out.println(p.equals(q));                          // true: equals(Point)
        System.out.println(p.equals(o));                          // false: Object.equals
        System.out.println(List.of(p).contains(q));               // false
        System.out.println(new HashSet<>(List.of(p)).contains(q)); // false
    }
}
