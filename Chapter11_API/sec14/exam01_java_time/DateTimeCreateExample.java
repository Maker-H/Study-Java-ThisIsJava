package sec14.exam01_java_time;

import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class DateTimeCreateExample {
    public static void main(String[] args) throws InterruptedException {
        //get date
        LocalDate currDate = LocalDate.now();
        System.out.println("Current date : "+currDate);

        LocalDate targeDate = LocalDate.of(2024,5,10);
        System.out.println("Target date : "+targeDate);

        //get time
        LocalTime currTime = LocalTime.now();
        System.out.println("Local time : "+currTime);

        LocalTime tarTime = LocalTime.of(6,30,0,0);
        System.out.println("Target time : "+tarTime);

        //get date and time
        LocalDateTime currDateTime = LocalDateTime.now();
        System.out.println(currDateTime);

        LocalDateTime targetDateTime = LocalDateTime.of(2024,5,10,6,30,0,0);
        System.out.println("Target Date and Time : "+targetDateTime);

        //UTC and timezone
        ZonedDateTime utcDateTime = ZonedDateTime.now(ZoneId.of("UTC"));
        System.out.println("UTC : "+ utcDateTime);
        ZonedDateTime newyorkDateTime = ZonedDateTime.now(ZoneId.of("America/New_York"));
        System.out.println("New york timezione : "+newyorkDateTime+'\n');

        /*
         String[] availableIDs = TimeZone.getAvailableIDs();
         for(String zoneId : availableIDs) {
            System.out.println(zoneId);
         }
         */
        //get timestamp of certaion point
        Instant instant1 = Instant.now();
        Thread.sleep(10);
        Instant instant2 = Instant.now();
        if(instant1.isBefore(instant2)) {
            System.out.println("instant1 is earlier");
        }else if(instant1.isAfter(instant2)) {
            System.out.println("instant1 is later");
        }else {
            System.out.println("Same time");
        }
        System.out.println("time difference(nanos) : "+instant1.until(instant2, ChronoUnit.NANOS));




                
    }
}
