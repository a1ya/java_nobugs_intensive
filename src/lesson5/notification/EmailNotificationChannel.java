package lesson5.notification;

public class EmailNotificationChannel extends NotificationChannel{

    private String email;

    public EmailNotificationChannel(String email) {
        this.email = email;
    }

    @Override
    public void notifyFromChannel(String message) {
        System.out.println("Sending email: '" + message + "' to email: " + this.email);
    }

}
