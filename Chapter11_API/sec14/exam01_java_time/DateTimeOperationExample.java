package sec14.exam01_java_time;

import java.time.LocalDateTime;

public class DateTimeOperationExample {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println("current date/time : "+now);

        LocalDateTime targetDateTime = now
        .plusYears(1)
        .plusMonths(2)
        .plusDays(1)
        .plusHours(1)
        .plusMinutes(1)
        .plusSeconds(1);
        System.out.println("After cal : "+targetDateTime);
    }
}
