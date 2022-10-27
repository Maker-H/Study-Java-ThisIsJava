package sec06_user_define_exception;

public class AccountExample {
 
    public static void main(String[] args) {
        Account account = new Account();
        //deposite
        account.deposit(10000);
        System.out.println("balance"+account.getBalance());
        
        try {
            account.withdraw(1000000);
            System.out.println("balance"+account.getBalance());
        } catch (BalanceInsufficientException e) {
            System.out.println(" ERROR");
            String message = e.getMessage();
            System.out.println(message);
            System.out.println();
            e.printStackTrace();



        }
    } 
}
