package w6.binding;

class Base {
    private String id() {                 // private: not virtual
        return "Base";
    }

    public String show() {
        return "show: " + id();
    }
}

class Derived extends Base {
    public String id() {                  // a NEW method, not an override
        return "Derived";
    }
}

public class PrivateMethodDemo {
    public static void main(String[] args) {
        Base b = new Derived();
        System.out.println(b.show());                 // show: Base
        System.out.println(new Derived().id());       // Derived
    }
}
