package w6.design;

import java.util.List;

public class NotificationDemo {
    public static void main(String[] args) {
        NotificationService service = new NotificationService(List.of(
                new EmailNotifier(), new SmsNotifier(), new PushNotifier()));

        service.broadcast("anna", "Your order has been shipped");
    }
}
