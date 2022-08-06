public class WhileKeyControlExample{
    public static void main(String[] args) throws Exception{
      boolean run = true;
      int speed = 0;
      int keyCode =0;

      while(run) {
        if(keyCode!=13 && keyCode!=10){ //if 'enter' is entered, CR and LF is entered, so if statement is excluded
        //if keyCode is not 13,10 run if statement
          System.out.println("------------------");
          System.out.println("1.increase speed|2.decrease speed|3.stop");
          System.out.println("------------------");
        }

        keyCode = System.in.read();

        if(keyCode == 49) {
          speed++;
          System.out.println("curent speed"+speed);
        }else if(keyCode == 50) { //if read 2
          speed--;
          System.out.println("current speed"+speed);
        }else if(keyCode == 51) { //if read 3
          run = false;
        }//end of if

      }//end of while

      System.out.println("end of program");
    } //end of main


    
}//end of class