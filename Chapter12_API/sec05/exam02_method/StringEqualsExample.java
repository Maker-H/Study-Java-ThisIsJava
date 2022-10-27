package sec05.exam02_method;

public class StringEqualsExample {
    public static void main(String[] args) {
        String strVar1 = new String("Sam");
        String strVar2 = "Sam";

        if(strVar1==strVar2) {
            System.out.println("Referes same object");
        } else {
            System.out.println("Referes differenct object");
        }

        if(strVar1.equals(strVar2)) {
            System.out.println("Have same string");
        } else {
            System.out.println("Have different string");
        }
    }
}
