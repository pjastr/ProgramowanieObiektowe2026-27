package w6.equality;

import java.util.Objects;

public class CustomerDemo {
    public static void main(String[] args) {
        Customer c1 = new Customer(1, 500_100_200L, 99.5, true, "Anna", new int[] {5, 4});
        Customer c2 = new Customer(1, 500_100_200L, 99.5, true, "Anna", new int[] {5, 4});
        System.out.println(c1.equals(c2));                       // true
        System.out.println(c1.hashCode() == c2.hashCode());      // true

        System.out.println(Objects.hash(1, 2) == 31 * (31 + 1) + 2);   // true
        System.out.println(Long.hashCode(1L << 32));             // 1
        System.out.println(Boolean.hashCode(true));              // 1231
    }
}
