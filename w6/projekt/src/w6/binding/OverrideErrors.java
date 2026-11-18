package w6.binding;

// Each commented-out @Override below is a compile error (see the slide).
class Parent {
    private String id() {
        return "Parent";
    }

    static String kind() {
        return "Parent";
    }

    String show() {
        return id() + " " + kind();
    }
}

class Child extends Parent {
    // @Override        // error: method does not override or implement
    String id() {       //        a method from a supertype
        return "Child";
    }

    // @Override        // error: static methods cannot be annotated with @Override
    static String kind() {
        return "Child";
    }

    // public void notifyAll() { }   // error: notifyAll() in Child cannot override
                                     // notifyAll() in Object; overridden method is final
}

public class OverrideErrors {
    public static void main(String[] args) {
        Parent p = new Child();
        System.out.println(p.show());      // Parent Parent: nothing was overridden
    }
}
