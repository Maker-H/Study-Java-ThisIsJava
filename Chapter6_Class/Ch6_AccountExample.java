public class Ch6_AccountExample{
	public static void main(String[] args){
	Lib_Account account = new Lib_Account();

	account.setBalance(10000);
	System.out.println("Current balance : " + account.getBalance());

	account.setBalance(-100);
	System.out.println("Current balance : " + account.getBalance());
	
	account.setBalance(2000000);
	System.out.println("Current balance : " + account.getBalance());
	
	account.setBalance(300000);
	System.out.println("Current balance : " + account.getBalance());
	}//end of main
}//end of class
