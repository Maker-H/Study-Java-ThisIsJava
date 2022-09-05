package sec06_user_define_exception;

public class Account {
    //Field
    private long balance;

    //Constructor
    public Account() {}

    //Method
    public long getBalance() {
        return balance;
    }

    public void deposit(int money) {
        balance+=money;
    }

    public void withdraw(int money) throws BalanceInsufficientException {
        if(balance<money) {
            throw new BalanceInsufficientException("insufficient balance"+(money-balance));
        }
        balance-=money;
    }
}