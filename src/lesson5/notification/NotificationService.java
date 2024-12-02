package lesson5.notification;

import java.util.ArrayList;
import java.util.Arrays;

public class NotificationService {

    private ArrayList<NotificationChannel> channels = new ArrayList<>();

    public void subscribe(NotificationChannel channel) {
        channels.add(channel);
    }

    public void unsubscribe(NotificationChannel channel) {
        channels.remove(channel);
    }

    public void notifyAllChannels(String message) {
        for (NotificationChannel channel : channels) {
            channel.notifyFromChannel(message);
        }
    }
}
