package w6.design;

import java.util.List;

public class NotificationService {
    private final List<Notifier> channels;        // base type only

    public NotificationService(List<Notifier> channels) {
        this.channels = List.copyOf(channels);
    }

    public void broadcast(String to, String message) {
        for (Notifier channel : channels) {
            channel.send(to, message);            // dynamic binding
        }
    }
}
