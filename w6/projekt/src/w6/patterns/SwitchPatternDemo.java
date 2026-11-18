package w6.patterns;

import w6.shapes.Circle;
import w6.shapes.Rectangle;
import w6.shapes.Square;

public class SwitchPatternDemo {
    static String describe(Object o) {
        return switch (o) {
            case null -> "nothing";
            case Circle c -> "circle, r = " + c.getRadius();
            case Square sq -> "square, side = " + sq.getWidth();
            case Rectangle r when r.getWidth() > r.getHeight() -> "wide rectangle";
            case Rectangle r -> "tall rectangle";
            case String s -> "text of length " + s.length();
            default -> "other: " + o;
        };
    }

    // static String wrongOrder(Object o) {
    //     return switch (o) {
    //         case Rectangle r -> "rect";
    //         case Square sq -> "square";   // error: this case label is dominated
    //         default -> "other";           //        by a preceding case label
    //     };
    // }
    //
    // static String noDefault(Object o) {
    //     return switch (o) {               // error: the switch expression does not
    //         case Circle c -> "circle";    //        cover all possible input values
    //         case String s -> "text";
    //     };
    // }

    public static void main(String[] args) {
        System.out.println(describe(new Circle(1)));        // circle, r = 1.0
        System.out.println(describe(new Square(2)));        // square, side = 2.0
        System.out.println(describe(new Rectangle(5, 1)));  // wide rectangle
        System.out.println(describe(new Rectangle(1, 5)));  // tall rectangle
        System.out.println(describe("Java"));               // text of length 4
        System.out.println(describe(42));                   // other: 42
        System.out.println(describe(null));                 // nothing
    }
}
