package Question.exam13_simpledataformat;

import java.sql.Date;
import java.text.SimpleDateFormat;

public class DataPrintExample {
    public static void main(String[] args) {
        Date now = new Date(0);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 E요일 hh시 mm분 ") ;
        System.out.println(sdf.format(now));
    }
}
