package sec05_throws;

public class ThrowsExample {
    public static void main(String[] args) {
        try {
            findClass();
        } catch(ClassNotFoundException e) {
            System.out.println("class does not exist");
        }
    }

    //Method
    public static void findClass() throws ClassNotFoundException {
        Class clazz = Class.forName("java.lang.String");
    }
}
