package sec03_try_catch_finally;

public class TryCatchFinallyExample {
    public static void main(String[] args) {
        try {
            Class clazz = Class.forName("java.lang.String");
            System.out.println("found a class");

        }catch(ClassNotFoundException e) {
            System.out.println("class doesn't exist");
        }finally { 
            System.out.println("end of program");
        }
    }
}