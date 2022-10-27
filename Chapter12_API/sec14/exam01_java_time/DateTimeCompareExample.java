package sec14.exam01_java_time;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class DateTimeCompareExample {
    public static void main(String[] args) {
        LocalDateTime startDatetime = LocalDateTime.of(2022,9,20,9,0,0);
        System.out.println("Start Date : "+startDatetime);

        LocalDateTime endDateTime = LocalDateTime.of(2025,3,31,18,0,0);
        System.out.println("End Time : "+endDateTime);
        
        //--------------------------
        
        if(startDatetime.isBefore(endDateTime)){
            System.out.println("Ongoing"+"\n");
        } else if(startDatetime.isEqual(endDateTime)) {
            System.out.println("Ending"+"\n");
        }else if(startDatetime.isAfter(endDateTime)) {
            System.out.println("Ended"+"\n");
        }
        //--------------------------
        System.out.println("[Time remaining before ending / LocalDateTime.until()]");
        long remainYear = startDatetime.until(endDateTime,ChronoUnit.YEARS);
        System.out.println("Remain year : "+remainYear);
        long remainMonth = startDatetime.until(endDateTime,ChronoUnit.MONTHS);
        System.out.println("Remain month: "+remainMonth);
        long remainDay = startDatetime.until(endDateTime,ChronoUnit.DAYS);
        System.out.println("Remain day: "+remainDay);
        long remainHour = startDatetime.until(endDateTime,ChronoUnit.HOURS);
        System.out.println("Remain Hour: "+remainHour);
        long remainMinute = startDatetime.until(endDateTime,ChronoUnit.MINUTES);
        System.out.println("Remain Minute: "+remainMinute);
        long remainSecond = startDatetime.until(endDateTime,ChronoUnit.SECONDS);
        System.out.println("Remain Second: "+remainSecond);
        System.out.println();
        
        System.out.println("[Time remaining before ending / chrono.between()]");
        remainYear = ChronoUnit.YEARS.between(startDatetime, endDateTime);
        remainMonth = ChronoUnit.MONTHS.between(startDatetime, endDateTime);
        remainDay = ChronoUnit.DAYS.between(startDatetime, endDateTime);
        remainHour = ChronoUnit.HOURS.between(startDatetime, endDateTime);
        remainMinute = ChronoUnit.MINUTES.between(startDatetime, endDateTime);
        remainSecond = ChronoUnit.SECONDS.between(startDatetime, endDateTime);
        System.out.println("Remain year : "+remainYear);
        System.out.println("Remain month: "+remainMonth);
        System.out.println("Remain day: "+remainDay);
        System.out.println("Remain Hour: "+remainHour);
        System.out.println("Remain Minute: "+remainMinute);
        System.out.println("Remain Second: "+remainSecond);
        System.out.println();
        
        //--------------------
        System.out.println("Time remaining until ending");
        Period period = Period.between(startDatetime.toLocalDate(), endDateTime.toLocalDate());
        System.out.print("Remain Time : "+period.getYears()+"year");
        System.out.print(period.getMonths()+"Month ");
        System.out.println(period.getDays()+"Day ");
        System.out.println();


    //-----------------------
    Duration duration = Duration.between(startDatetime, endDateTime);
    System.out.println("difference toLocal : "+startDatetime.toLocalTime()+" localdatetime : "+startDatetime);
    System.out.println("Remain Time : "+duration.getSeconds());
    System.out.println(" "+duration.toHours());
    duration = Duration.between(startDatetime.toLocalTime(), endDateTime.toLocalTime());
    System.out.println("toLocalTime : "+duration.toHours());



        
    }
}
