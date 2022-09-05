package Question;

public class NotExistIDException extends Exception {
    //Constructor
    public NotExistIDException(){}
    public NotExistIDException(String message) {
        super(message);
    }
}
