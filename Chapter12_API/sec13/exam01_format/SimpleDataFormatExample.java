package sec13.exam01_format;

import java.util.Date;
import java.text.SimpleDateFormat;
public class SimpleDataFormatExample {
    public static void main(String[] args) {
        Date now = new Date();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(sdf.format(now));

        sdf = new SimpleDateFormat("yyyy MM dd ");
        System.out.println(sdf.format(now));
        
        sdf = new SimpleDateFormat("yyyy.MM.dd a HH:mm:ss");
        System.out.println(sdf.format(now));

        sdf = new SimpleDateFormat("E");
        System.out.println("Today is "+ sdf.format(now));

        sdf = new SimpleDateFormat("yyyy.MM.dd a HH:mm:ss");
        System.out.println(sdf.format(now));

        sdf = new SimpleDateFormat("D");
        System.out.println("Today is "+sdf.format(now)+"th day of year");

        sdf = new SimpleDateFormat("오늘은 d번째 날입니다");
        System.out.println(sdf.format(now));



    }
}
