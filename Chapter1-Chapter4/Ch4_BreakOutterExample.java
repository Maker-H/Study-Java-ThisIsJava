public class Ch4_BreakOutterExample{
    public static void main(String[] args) {
      Outter : for(char upper ='A';upper<='Z';upper++) {
        for(char lower='a';lower<='z';lower++) {
          System.out.println(upper +"-"+lower);
          if(lower =='g') {
            break Outter;
          }
        }
      }//end of loop
      System.out.println("end of program");
    } //end of main
}//end of class