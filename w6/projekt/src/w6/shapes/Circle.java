package w6.shapes;

public class Circle extends Shape {
    private final double radius;

    public Circle(double radius) {
        super("circle");
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}
