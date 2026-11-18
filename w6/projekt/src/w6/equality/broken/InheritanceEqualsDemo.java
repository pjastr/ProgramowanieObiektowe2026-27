package w6.equality.broken;

public class InheritanceEqualsDemo {
    public static void main(String[] args) {
        Person p = new Person("Anna", 30);
        Employee e = new Employee("Anna", 30, "IT");
        System.out.println(p.equals(e));     // true
        System.out.println(e.equals(p));     // false: symmetry broken

        MixedEmployee it = new MixedEmployee("Anna", 30, "IT");
        MixedEmployee hr = new MixedEmployee("Anna", 30, "HR");
        System.out.println(it.equals(p) + " " + p.equals(it));   // true true
        System.out.println(p.equals(hr) + " " + hr.equals(p));   // true true
        System.out.println(it.equals(hr));   // false: transitivity broken
    }
}
