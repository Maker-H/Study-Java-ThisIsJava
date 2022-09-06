public class Ch5_EnumMethodExample {
    public static void main(String[] args) {
        //name() method
        //returns the string that an eumuration object has
        Week today = Week.SUNDAY;
        String name = today.name(); 
        System.out.println(name);
        System.out.println();


        //ordinal() method
        //return index of enumuration object
        int ordinal = today.ordinal(); //6
        System.out.println(ordinal);
        System.out.println();


        //compareTo() method
        //returns the number of position based on given enumeration object
        Week day1 = Week.MONDAY;
        Week day2 = Week.SATURDAY;
        int result1 = day1.compareTo(day2); //day1 is earlier so negative num
        int result2 = day2.compareTo(day1); //day2 is later so positive num
        System.out.println(result1);
        System.out.println(result2);
        System.out.println();


        //valueOf() method
        //returns an enumeration object with the same string as given string 
        //to be exact, valueOf method returns the address of enumeration object with the same string as given string
        if(args.length == 1 ){
            String strDay = args[0];
            Week weekDay = Week.valueOf(strDay);
            if(weekDay == Week.SATURDAY || weekDay == Week.SUNDAY){
                System.out.println("It's holiday");
            } else {
                System.out.println("Its weekday");
            }
        }
        System.out.println();


        //values() method
        //return array made by all the enumertaion objects in enumeration type 
        Week[] days = Week.values();
        for(Week day : days){
            System.out.println(day);
        }
    }//end of main
    
}//end of class


