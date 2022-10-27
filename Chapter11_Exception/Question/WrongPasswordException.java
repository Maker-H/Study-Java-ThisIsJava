package Question;

public class WrongPasswordException extends Exception{
    //Contructor
    public WrongPasswordException() {}
    public WrongPasswordException(String message) {
        super(message);
    }
}
