package w6.binding;

public class Animal {
    public String meet(Animal other) {
        return "Animal meets Animal";
    }

    public String meet(Dog other) {
        return "Animal meets Dog";
    }
}
