import java.util.Calendar;

public class Ch5_EnumWeekExample {
    public static void main(String[] args) {
        Week today = null;

        Calendar cal = Calendar.getInstance();
        int week = cal.get(Calendar.DAY_OF_WEEK); //today's day. 1~7

        switch(week){
            case 1:
                today = Week.SUNDAY; break;
            case 2:
                today = Week.MONDAY; break;
            case 3:
                today = Week.TUESDAY; break;
            case 4:
                today = Week.WEDNESDAY; break;
            case 5:
                today = Week.THRUSDAY; break;
            case 6:
                today = Week.FRIDAY; break;
        } //end of switch

        System.out.println("Today's day is "+today);

        if(today==Week.SUNDAY){
            System.out.println("I play soccer on sunday ");
        }else {
            System.out.println("I study java really hard ");
        }

    }//end of main

   
    
}//end of class

