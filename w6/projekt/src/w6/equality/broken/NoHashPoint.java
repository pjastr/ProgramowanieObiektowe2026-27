package w6.equality.broken;

public class NoHashPoint {
    private final int x;
    private final int y;

    public NoHashPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        return o instanceof NoHashPoint p && x == p.x && y == p.y;
    }
    // no hashCode(): Object.hashCode() differs for different objects
}
