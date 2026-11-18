package w6.design;

public class Notifier {
    public void send(String to, String message) {
        System.out.println("[log] " + to + ": " + message);
    }
}
