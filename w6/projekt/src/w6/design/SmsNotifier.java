package w6.design;

public class SmsNotifier extends Notifier {
    private static final int MAX_LENGTH = 20;

    @Override
    public void send(String to, String message) {
        String text = message.length() > MAX_LENGTH
                ? message.substring(0, MAX_LENGTH) + "..." : message;
        System.out.println("SMS to " + to + ": " + text);
    }
}
