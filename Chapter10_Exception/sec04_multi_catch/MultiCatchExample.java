package sec04_multi_catch;


public class MultiCatchExample {
    public static void main(String[] args) {
        try {
            String data1 = args[0];
            String data2 = args[1];
            int value1 = Integer.parseInt(data1);
            int value2 = Integer.parseInt(data2);
            int result = value1+value2;
            System.out.println("data1+data2="+result);
        } catch(ArrayIndexOutOfBoundsException | NumberFormatException e) {
            System.out.println("Out Of Index and cannot conver to number");
        } catch (Exception e) {
            System.out.println("unknown error");
        } finally {
            System.out.println("End of Program");
        }
    }
}
