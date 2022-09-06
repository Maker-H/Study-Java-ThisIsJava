import java.util.Scanner;


public class Ch4_Exercise7_BankProgram{
    public static void main(String[] args) {
      boolean run = true;
      int menu;

      int balance = 0;
      
      Scanner scanner = new Scanner(System.in);

      
      while(run) {
        
          System.out.println("-------------------");
          System.out.println("1.Deposite|2.Withdrawal|3.Balance|4.Exit");
          System.out.println("-------------------");
          System.out.print("Enter> ");
        

        menu = scanner.nextInt();
         
        switch(menu) {
          case 1: 
          System.out.println("How much do you want to deposite?");
          System.out.print("Enter> ");
          balance+=scanner.nextInt();
          break;
          case 2:
          System.out.println("How much do you want to deposite?");
          System.out.print("Enter> ");
          balance-=scanner.nextInt();
          break;
          case 3:
          System.out.println("Balance : "+balance);
          break;
          case 4:
          run = false;

        }

      }//and of loop


     
     
    }//end of main    
}//end of class