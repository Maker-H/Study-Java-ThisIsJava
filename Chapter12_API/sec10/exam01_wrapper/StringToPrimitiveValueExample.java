package sec10.exam01_wrapper;

public class StringToPrimitiveValueExample {
    public static void main(String[] args) {
        int value1 = Integer.parseInt("10");
        double value2 = Double.parseDouble("10.4");
        boolean value3 = Boolean.parseBoolean("true");

        System.out.println("value : "+value1);
        System.out.println("value : "+value2);
        System.out.println("value : "+value3);
    }
}
