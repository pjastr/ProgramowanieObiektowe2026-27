package w6.equality;

import java.util.Objects;

public class Employee extends Person {
    private final String department;

    public Employee(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) {              // the same class + Person's fields
            return false;
        }
        Employee other = (Employee) o;       // safe: getClass() checked in Person
        return Objects.equals(department, other.department);
    }

    @Override
    public int hashCode() {
        return 31 * super.hashCode() + Objects.hashCode(department);
    }
}
