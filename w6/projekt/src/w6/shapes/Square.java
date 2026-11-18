package w6.shapes;

public class Square extends Rectangle {   // immutable, so LSP holds
    public Square(double side) {
        super("square", side, side);
    }
}
