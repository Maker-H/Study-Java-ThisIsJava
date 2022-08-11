public class Lib_BankApplication{
	//Field
	private String accountnum;
	private String owner;
	private int balance;

	//Constructor
	public Lib_BankApplication(String accountnum, String owner, int balance) {
		this.accountnum = accountnum;
		this.owner = owner;
		this.balance = balance;
	}

	//Mehtod
	public String getAno() {return accountnum;}
	public void setAno(String accountnum) {this.accountnum = accountnum;}
	public String getOwner() {return owner;}
	public void setOwner(String owner) {this.owner = owner;}
	public int getBalance() {return balance;}
	public void setBalance(int balance) {this.balance = balance;}

}//end of class
