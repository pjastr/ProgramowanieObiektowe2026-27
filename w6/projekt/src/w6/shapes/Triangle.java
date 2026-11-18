package w6.shapes;

public class Triangle extends Shape {      // added later: no other changes
    private final double base;
    private final double height;

    public Triangle(double base, double height) {
        super("triangle");
        this.base = base;
        this.height = height;
    }

    @Override
    public double area() {
        return 0.5 * base * height;
    }
}
