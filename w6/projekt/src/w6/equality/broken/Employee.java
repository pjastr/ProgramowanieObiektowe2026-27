package w6.equality.broken;

import java.util.Objects;

public class Employee extends Person {           // attempt 1: breaks symmetry
    private final String department;

    public Employee(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Employee other)) {    // a plain Person is never equal
            return false;
        }
        return super.equals(o) && Objects.equals(department, other.department);
    }

    @Override
    public int hashCode() {
        return 31 * super.hashCode() + Objects.hashCode(department);
    }
}
