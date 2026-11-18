package w6.equality.broken;

import java.util.Objects;

public class MixedEmployee extends Person {      // attempt 2: breaks transitivity
    private final String department;

    public MixedEmployee(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof MixedEmployee other)) {
            return super.equals(o);              // vs a Person: ignore department
        }
        return super.equals(o) && Objects.equals(department, other.department);
    }

    @Override
    public int hashCode() {
        return super.hashCode();                 // must ignore department now
    }
}
