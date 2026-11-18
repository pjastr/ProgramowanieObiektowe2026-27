package w6.binding;

public class Dog extends Animal {
    @Override
    public String meet(Animal other) {
        return "Dog meets Animal";
    }

    @Override
    public String meet(Dog other) {
        return "Dog meets Dog";
    }
}
