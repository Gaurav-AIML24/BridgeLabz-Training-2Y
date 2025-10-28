package lambda_expression;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class NotificationFilter {
    public static void main(String[] args) {
        String[] alerts = {"Blood Pressure", "Heart Rate", "Appointment"};
        Predicate<String> filter = alert -> alert.contains("Rate");
        String[] filtered = Stream.of(alerts).filter(filter).toArray(String[]::new);
        for (String alert : filtered) {
            System.out.println(alert);
        }
    }
}
