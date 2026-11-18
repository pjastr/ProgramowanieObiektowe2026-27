package w6.binding;

public class Greeter {
    String hello() {                       // package-private
        return "Hello";
    }

    public String greet() {
        return hello() + "!";
    }
}
