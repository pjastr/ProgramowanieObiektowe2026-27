package w6.casting;

import w6.shapes.Circle;
import w6.shapes.Shape;
import w6.shapes.Square;

public class CastRulesDemo {
    public static void main(String[] args) {
        Shape s = new Square(2);
        Object o = s;

        Square sq = (Square) o;           // OK: Object -> Square
        // String t = (String) s;         // error: incompatible types:
                                          // Shape cannot be converted to String
        // Circle c = (Circle) sq;        // error: incompatible types:
                                          // Square cannot be converted to Circle
        String text = (String) o;         // compiles: o could be a String
    }                                     // runtime: ClassCastException
}
