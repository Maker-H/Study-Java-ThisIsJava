package sec06_user_define_exception;

public class BalanceInsufficientException extends Exception{
    
    //Constructor
    public BalanceInsufficientException() {}
    public BalanceInsufficientException(String message) {
        //pass message variable to constructor of parent class 
        super(message);
    }
    
}
