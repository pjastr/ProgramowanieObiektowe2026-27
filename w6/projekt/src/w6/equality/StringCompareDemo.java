package w6.equality;

import java.util.Objects;

public class StringCompareDemo {
    public static void main(String[] args) {
        String s1 = new String("Hello");
        String s2 = new String("Hello");
        String s3 = "Hello";
        String s4 = "Hel" + "lo";                         // constant: from the pool
        String none = null;

        System.out.println(s1 == s2);                     // false: two objects
        System.out.println(s1.equals(s2));                // true: the same text
        System.out.println(s3 == s4);                     // true: one pooled object
        System.out.println(s1.intern() == s3);            // true
        System.out.println(s1.equalsIgnoreCase("hello")); // true

        System.out.println("Hello".equals(none));         // false: null-safe order
        System.out.println(Objects.equals(none, s1));     // false
        System.out.println(Objects.equals(null, null));   // true
        // System.out.println(none.equals("Hello"));      // NullPointerException
    }
}
