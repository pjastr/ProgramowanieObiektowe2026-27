package w6.shapes;

public class ShapesDemo {
    static double totalArea(Shape[] shapes) {
        double sum = 0;
        for (Shape s : shapes) {
            sum += s.area();              // which area()? decided at runtime
        }
        return sum;
    }

    public static void main(String[] args) {
        Shape[] shapes = {
            new Circle(1), new Rectangle(2, 3), new Square(2), new Triangle(4, 3)
        };
        for (Shape s : shapes) {
            System.out.println(s.report());
        }
        System.out.println("total = " + Math.round(totalArea(shapes)));
    }
}
