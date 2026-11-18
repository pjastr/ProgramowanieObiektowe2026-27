package w6.binding;

public class DispatchDemo {
    public static void main(String[] args) {
        Animal a = new Dog();
        Animal b = new Dog();
        Dog d = new Dog();

        System.out.println(a.meet(b));   // Dog meets Animal
        System.out.println(a.meet(d));   // Dog meets Dog
        System.out.println(d.meet(b));   // Dog meets Animal
        System.out.println(a.meet((Dog) b));   // Dog meets Dog
    }
}
