package sec10.exam01_wrapper;

public class AutoBoxingUnboxingExample {
    public static void main(String[] args) {
        //Auto-boxing
        Integer obj = 100;
        System.out.println("value : "+obj.intValue());
        System.out.println("value : "+obj);

        //Auto-unboxing when substitute
        int value = obj;
        System.out.println("value : "+value);

        //Auto-unboxing when calculate
        int result = obj + 100;
        System.out.println("result : " +result);
    }
}
