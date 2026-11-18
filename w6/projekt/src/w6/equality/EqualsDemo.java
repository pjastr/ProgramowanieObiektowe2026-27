package w6.equality;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class EqualsDemo {
    public static void main(String[] args) {
        Person a = new Person("Anna", 30);
        Person b = new Person("Anna", 30);
        Employee e = new Employee("Anna", 30, "IT");
        Employee f = new Employee("Anna", 30, "IT");

        System.out.println(a == b);                          // false: two objects
        System.out.println(a.equals(b));                     // true: the same state
        System.out.println(a.equals(e) + " " + e.equals(a)); // false false: symmetric
        System.out.println(e.equals(f));                     // true
        System.out.println(a.equals(null));                  // false
        System.out.println(a.hashCode() == b.hashCode());    // true

        Set<Person> people = new HashSet<>(List.of(a, e));
        System.out.println(people.contains(b) + " " + people.contains(f));  // true true
    }
}
