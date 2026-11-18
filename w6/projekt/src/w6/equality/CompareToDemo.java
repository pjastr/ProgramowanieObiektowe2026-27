package w6.equality;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

public class CompareToDemo {
    public static void main(String[] args) {
        BigDecimal x = new BigDecimal("2.0");
        BigDecimal y = new BigDecimal("2.00");

        System.out.println(x.equals(y));                         // false
        System.out.println(x.compareTo(y));                      // 0
        System.out.println(new HashSet<>(List.of(x, y)).size()); // 2: equals + hashCode
        System.out.println(new TreeSet<>(List.of(x, y)).size()); // 1: compareTo
    }
}
