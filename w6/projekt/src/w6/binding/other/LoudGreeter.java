package w6.binding.other;

import w6.binding.Greeter;

public class LoudGreeter extends Greeter {
    // @Override                           // error: method does not override or
    String hello() {                       // implement a method from a supertype
        return "HELLO";                    // a NEW method: other package
    }

    public static void main(String[] args) {
        Greeter g = new LoudGreeter();
        System.out.println(g.greet());     // Hello!  (not HELLO!)
    }
}
