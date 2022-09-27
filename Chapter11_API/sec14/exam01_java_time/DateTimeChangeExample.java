package sec14.exam01_java_time;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class DateTimeChangeExample {
    public static void main(String[] args) {
        LocalDateTime now =LocalDateTime.now();
        System.out.println("Current : "+now);

        LocalDateTime targetDateTime = null;
        //make a direct change
        targetDateTime = now
        .withYear(1)
        .withMonth(1)
        .withDayOfMonth(1)
        .withHour(1)
        .withMinute(1)
        .withSecond(1);
        System.out.println("direct change : "+targetDateTime);

        //change year relatively
        targetDateTime = now.with(TemporalAdjusters.firstDayOfYear());
        System.out.println("First day of this year : "+targetDateTime);
        targetDateTime = now.with(TemporalAdjusters.lastDayOfYear());
        System.out.println("Last day of this year : "+targetDateTime);
        targetDateTime = now.with(TemporalAdjusters.firstDayOfNextYear());
        System.out.println("First day of next year : "+targetDateTime);

        //change month relatively
        targetDateTime = now.with(TemporalAdjusters.firstDayOfMonth());
        System.out.println("First day of this month : "+targetDateTime);
        targetDateTime = now.with(TemporalAdjusters.lastDayOfMonth());
        System.out.println("Last day of this month : "+targetDateTime);
        targetDateTime = now.with(TemporalAdjusters.firstDayOfNextMonth());
        System.out.println("First day of next month : "+targetDateTime);


        //change date relatively
        targetDateTime = now.with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY));
        System.out.println("First MONDAY of this month : "+targetDateTime);
        targetDateTime = now.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
        System.out.println("Next MONDAY : "+targetDateTime);
        targetDateTime = now.with(TemporalAdjusters.previous(DayOfWeek.MONDAY));
        System.out.println("Previous MONDAY: "+targetDateTime);


    }
}
