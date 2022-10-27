package sec03_try_catch_finally;

public class TryCatchFinallyRuntimeExceptionExample {
    public static void main(String[] args) {
        String data1 = null;
        String data2 = null;
        
        try{
            data1 = args[0];
            data2 = args[1];
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("out of index");
            return; //end of method
        }

        try {
            int value1 = Integer.parseInt(data1);
            int value2 = Integer.parseInt(data2);
            int result = value1+value2;
            System.out.print("value1 + value2 = " + result);
        } catch (NumberFormatException e) {
            System.out.print("cannot convert to integer");
        } finally {
            System.out.println("run program again");
        }
    }
}