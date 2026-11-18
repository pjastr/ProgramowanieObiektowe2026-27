package w6.equality.broken;

import java.util.Objects;

public class Point {
    private final int x;
    private final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public boolean equals(Point other) {        // overload, NOT override!
        return other != null && x == other.x && y == other.y;
    }   // with @Override: error: method does not override or implement
        // a method from a supertype

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
