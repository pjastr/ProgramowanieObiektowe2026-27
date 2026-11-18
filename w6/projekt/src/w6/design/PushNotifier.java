package w6.design;

public class PushNotifier extends Notifier {      // new channel
    @Override
    public void send(String to, String message) {
        System.out.println("push to " + to + "'s phone: " + message);
    }
}
