package w6.education;

import java.util.Objects;

public class School {
    private static final String DEFAULT_ADDRESS = "ul. Słoneczna 54, 10-710 Olsztyn";
    private static final int DEFAULT_STUDENTS = 100;
    private static final int MAX_STUDENTS = 500;

    private String name;
    private String address;
    private int students;

    public School(String name, String address, int students) {
        this.name = name;
        this.address = isValidAddress(address) ? address : DEFAULT_ADDRESS;
        this.students = students > 0 ? students : DEFAULT_STUDENTS;
    }

    private static boolean isValidAddress(String address) {
        return address != null && !address.isEmpty();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        if (isValidAddress(address)) {
            this.address = address;
        }
    }

    public int getStudents() {
        return students;
    }

    public void setStudents(int students) {
        if (students > 0) {
            this.students = students;
        }
    }

    public void recruitment(int count) {
        students = Math.min(students + count, MAX_STUDENTS);
    }

    @Override
    public String toString() {
        String namePart = (name == null || name.isEmpty()) ? "" : "Name: " + name + ". ";
        return getClass().getSimpleName() + ": " + namePart
                + "Address: " + address + ". Number of students: " + students + ".";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        School other = (School) o;
        return address.equals(other.address);       // address is never null
    }

    @Override
    public int hashCode() {
        return Objects.hash(address);               // only the field used in equals
    }
}
