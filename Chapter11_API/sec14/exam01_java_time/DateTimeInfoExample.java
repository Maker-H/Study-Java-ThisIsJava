package sec14.exam01_java_time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class DateTimeInfoExample {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        String strDateTime = now.getYear()+"year ";
        strDateTime += now.getMonthValue()+"month ";
        strDateTime += now.getDayOfMonth()+"date ";
        strDateTime += now.getDayOfWeek()+" ";
        strDateTime += now.getHour()+"H ";
        strDateTime += now.getMinute()+"M ";
        strDateTime += now.getSecond()+"S ";
        strDateTime += now.getNano()+ "Nanosec ";
        System.out.println(strDateTime +"\n");

        LocalDate nowDate = now.toLocalDate();
        if(nowDate.isLeapYear()) {
            System.out.println("This year is  leap year: Faburary has until 29");
        }else {
            System.out.println("This year is average year : Faburary has until 28");
        }

        //UTF and zone offset
        ZonedDateTime utcDateTime = ZonedDateTime.now(ZoneId.of("UTC"));
        System.out.println("UTC: "+utcDateTime);
        ZonedDateTime seoulDateTime = ZonedDateTime.now(ZoneId.of("Asia/Seoul"));
        System.out.println("Seoul timezone : "+seoulDateTime);
        ZoneOffset seoulZoneOffset = seoulDateTime.getOffset();
        System.out.println("Seoul zone offset : "+seoulZoneOffset);
    }
}
