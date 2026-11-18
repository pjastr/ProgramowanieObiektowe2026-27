package w6.design;

public class EmailNotifier extends Notifier {
    @Override
    public void send(String to, String message) {
        System.out.println("e-mail to " + to + "@example.com: " + message);
    }
}
