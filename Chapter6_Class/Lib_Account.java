public class Lib_Account{
	//Field
	private int balance;
	final static int MIN_BALANCE = 0;
	final static int MAX_BALANCE = 1000000;

	//Method
	void setBalance(int balance) {
		
		if(balance<Lib_Account.MIN_BALANCE) { //condition of balance
			this.balance = MIN_BALANCE;
		} else if(balance>1000000) {
			this.balance = MAX_BALANCE;
		}
	}

	int getBalance() {
		return this.balance;
	}
}//end of class
