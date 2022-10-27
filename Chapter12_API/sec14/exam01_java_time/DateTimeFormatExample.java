package sec14.exam01_java_time;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class DateTimeFormatExample {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter datetimeformatter = DateTimeFormatter.ofPattern("yyyy년 m월 d일 a h시 m분");
        String nowString = now.format(datetimeformatter);
        System.out.println(nowString);

    }
}
