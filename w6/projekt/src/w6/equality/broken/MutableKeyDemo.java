package w6.equality.broken;

import java.util.HashSet;
import java.util.Set;

public class MutableKeyDemo {
    public static void main(String[] args) {
        MutablePoint p = new MutablePoint(1, 2);
        Set<MutablePoint> set = new HashSet<>();
        set.add(p);

        p.setX(10);                                        // hashCode changes!
        System.out.println(set.contains(p));               // false: wrong bucket
        System.out.println(set.contains(new MutablePoint(1, 2)));  // false
        System.out.println(set.remove(p));                 // false: cannot remove
        System.out.println(set.size());                    // 1: lost element
    }
}
