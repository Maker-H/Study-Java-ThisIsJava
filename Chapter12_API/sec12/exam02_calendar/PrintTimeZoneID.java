package sec12.exam02_calendar;

import java.util.TimeZone;
import java.util.Calendar;
public class PrintTimeZoneID {
    public static void main(String[] args) {
        String[] availableIDs = TimeZone.getAvailableIDs();
        for(String availableId : availableIDs) {
            System.out.println(availableId);
        }

        TimeZone timezone = TimeZone.getTimeZone("Asia/Singapore");
        Calendar sing = Calendar.getInstance(timezone);



        System.out.println(
            sing.get(Calendar.HOUR)+"H "
            +sing.get(Calendar.MINUTE)+"M "
            +sing.get(Calendar.SECOND)+"S "
            +sing.get(Calendar.AM_PM));
    }
}
