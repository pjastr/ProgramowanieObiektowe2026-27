package w6.equality;

import java.math.BigDecimal;

public class FloatingPointDemo {
    public static void main(String[] args) {
        double a = 1.2;
        double b = 1.1 + 0.1;                               // 1.2000000000000002
        System.out.println(a == b);                         // false
        System.out.println(Math.abs(a - b) < 1e-9);         // true: tolerance

        double nan = Double.NaN;
        System.out.println(nan == nan);                     // false!
        System.out.println(Double.compare(nan, nan) == 0);  // true
        System.out.println(0.0 == -0.0);                    // true
        System.out.println(Double.compare(0.0, -0.0) == 0); // false

        BigDecimal x = new BigDecimal("2.0");
        BigDecimal y = new BigDecimal("2.00");
        System.out.println(x.equals(y));                    // false: scale 1 vs 2
        System.out.println(x.compareTo(y) == 0);            // true: the same value
    }
}
