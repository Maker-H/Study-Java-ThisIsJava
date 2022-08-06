import java.util.Scanner;


public class Ch4_DoWhileExample{
    public static void main(String[] args) {
      System.out.println("enter message");
      System.out.println("If you want to end program enter q");

      Scanner scanner = new Scanner(System.in);
      String inputString;

      do {
        System.out.print(">");
        inputString = scanner.nextLine();
        System.out.println(inputString);
      }while(!inputString.equals("q"));//end of do-while

      System.out.println();
      System.out.println("end of program");
      
    } //end of main


    
}//end of class