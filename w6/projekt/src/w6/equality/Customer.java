package w6.equality;

import java.util.Arrays;
import java.util.Objects;

public class Customer {
    private final int id;
    private final long phone;
    private final double balance;
    private final boolean active;
    private final String name;
    private final int[] scores;

    public Customer(int id, long phone, double balance, boolean active,
                    String name, int[] scores) {
        this.id = id;
        this.phone = phone;
        this.balance = balance;
        this.active = active;
        this.name = name;
        this.scores = scores.clone();
    }

    @Override
    public boolean equals(Object o) {
        return o instanceof Customer c                                     // also false for null
                && id == c.id && phone == c.phone && active == c.active    // int, long, boolean
                && Double.compare(balance, c.balance) == 0                 // double
                && Objects.equals(name, c.name)                            // object, may be null
                && Arrays.equals(scores, c.scores);                        // array content
    }

    @Override
    public int hashCode() {
        int result = Integer.hashCode(id);               // = id
        result = 31 * result + Long.hashCode(phone);     // (int) (v ^ (v >>> 32))
        result = 31 * result + Double.hashCode(balance); // from the bits of the value
        result = 31 * result + Boolean.hashCode(active); // 1231 or 1237
        result = 31 * result + Objects.hashCode(name);   // 0 for null
        result = 31 * result + Arrays.hashCode(scores);  // from the array content
        return result;
    }
}
