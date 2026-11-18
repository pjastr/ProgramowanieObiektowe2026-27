package w6.equality.broken;

import java.util.Objects;

public class MutablePoint {
    private int x;
    private int y;

    public MutablePoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    @Override
    public boolean equals(Object o) {
        return o instanceof MutablePoint p && x == p.x && y == p.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
