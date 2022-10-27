package Question;

public class LoginExample {
    public static void main(String[] args) {
        
        try {
            login("while", "12345");
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
        
        try {
            login("blue", "12345111");
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }

    //Method
    public static void login(String id, String password) throws NotExistIDException, WrongPasswordException {
        //if id is not blue thorw NotExistIDException
        if(!id.equals("blue")) {
            throw new NotExistIDException("ID doesn't exist!!!! This is an error message");
        }

        //if password is not 12345 throw WrongPasswordException
        if(!password.equals("12345")) {
            throw new WrongPasswordException("PASSWORD doesn't exist!!!! This is an error message");
        }

    }
}
