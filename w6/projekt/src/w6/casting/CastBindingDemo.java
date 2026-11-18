package w6.casting;

import w6.shapes.Circle;
import w6.shapes.Shape;

public class CastBindingDemo {
    public static void main(String[] args) {
        Circle circle = new Circle(1);

        System.out.println(((Shape) circle).area());        // 3.141592653589793
        System.out.println(((Object) circle).toString());   // circle: area = 3.14
    }
}
