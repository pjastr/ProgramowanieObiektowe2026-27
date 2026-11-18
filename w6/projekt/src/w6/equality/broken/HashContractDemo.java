package w6.equality.broken;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HashContractDemo {
    public static void main(String[] args) {
        NoHashPoint a = new NoHashPoint(1, 2);
        NoHashPoint b = new NoHashPoint(1, 2);
        System.out.println(a.equals(b));                  // true
        System.out.println(a.hashCode() == b.hashCode()); // false (almost always)

        Set<NoHashPoint> set = new HashSet<>();
        set.add(a);
        System.out.println(set.contains(b));              // false
        set.add(b);
        System.out.println(set.size());                   // 2: "duplicates"

        Map<NoHashPoint, String> map = new HashMap<>();
        map.put(a, "A");
        System.out.println(map.get(b));                   // null
    }
}
