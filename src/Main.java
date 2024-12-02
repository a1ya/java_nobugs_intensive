import lesson5.notification.EmailNotificationChannel;
import lesson5.notification.NotificationService;
import lesson5.notification.SmsNotificationChannel;

public class Main {

    public static void main(String[] args) {

/*        DiscountStrategy discountStrategy = new DiscountStrategyHandler().getStrategy(CustomerType.VIP);
        System.out.println(discountStrategy.calculate(500));*/

        NotificationService notificationService = new NotificationService();
        notificationService.subscribe(new SmsNotificationChannel("99988887777"));
        notificationService.subscribe(new EmailNotificationChannel("asd@fgh.com"));
        notificationService.notifyAllChannels("Test message");

    }



}