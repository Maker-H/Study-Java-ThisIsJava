package sec12.exam02_calendar;

import java.util.Calendar;
public class CalendarExample {
    public static void main(String[] args) {
        Calendar now = Calendar.getInstance();

        int year = now.get(Calendar.YEAR);
        int month = now.get(Calendar.MONTH)+1;
        int day = now.get(Calendar.DAY_OF_MONTH);

        int week = now.get(Calendar.DAY_OF_WEEK);
        String strWeek = null;
        switch(week) {
            case Calendar.MONDAY:
            strWeek = "monday";        
            break;

            case Calendar.TUESDAY:
            strWeek = "tuesday";
            break;
            
            case Calendar.WEDNESDAY:
            strWeek = "wendsday";
            break;

            case Calendar.THURSDAY:
            strWeek = "thursday";
            break;

            case Calendar.FRIDAY:
            strWeek = "friday";
            break;

            case Calendar.SATURDAY:
            strWeek = "saturday";
            break;

            case Calendar.SUNDAY:
            strWeek = "sunday";
            break;
        }

        int amPm = now.get(Calendar.AM_PM);
        String strAmPm = null;
        if(amPm == Calendar.AM) {
            strAmPm = "am";
        }else {
            strAmPm = "pm";
        }

        int hour = now.get(Calendar.HOUR);
        int minute = now.get(Calendar.MINUTE);
        int second = now.get(Calendar.SECOND);

        System.out.println(hour+"hour "+minute+"minute "+second+"second");
        System.out.println(year+" year");
        System.out.println(month+ " month");
        System.out.println(day+ " day");
        System.out.println(strAmPm + " am/pm");
        System.out.println(hour+ " hour");
        System.out.println(minute+"minute");
        System.out.println(second + " second");

    }
}
