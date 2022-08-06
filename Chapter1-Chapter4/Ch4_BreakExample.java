public class Ch4_BreakExample{
    public static void main(String[] args) {
      while(true){
        int num = (int)(Math.random()*6)+1; //1~6
        System.out.println(num);
        if(num ==6) {
          break;
        }//end of if

      }//end of while
      System.out.println("end of program");
      
    } //end of main


    
}//end of class