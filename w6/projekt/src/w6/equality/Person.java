package w6.equality;

import java.util.Objects;

public class Person {
    private final String name;
    private final int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {                                  // 1. the same object
            return true;
        }
        if (o == null || getClass() != o.getClass()) {    // 2. null or another class
            return false;
        }
        Person other = (Person) o;                        // 3. safe cast
        return age == other.age                           // 4. compare the fields
                && Objects.equals(name, other.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);                   // the same fields as equals
    }

    @Override
    public String toString() {
        return "Person[name=" + name + ", age=" + age + "]";
    }
}
