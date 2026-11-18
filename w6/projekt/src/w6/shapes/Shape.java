package w6.shapes;

public class Shape {
    private final String name;

    public Shape(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double area() {               // overridden in subclasses
        return 0.0;
    }

    public final String report() {       // template method: fixed steps
        return getName() + ": area = " + Math.round(area() * 100) / 100.0;
    }

    @Override
    public String toString() {
        return report();
    }
}
