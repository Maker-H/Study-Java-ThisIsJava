package sec03.exam03_systemtime;

public class SystemTimeExample {
    public static void main(String[] args) {
        long time1 = System.nanoTime();

        int sum = 0;
        for(int i=0; i<=1000000; i++) {
            sum += i;
        }

        long time2 = System.nanoTime();

        System.out.println("Total 1~1000000 is : " + sum);
        System.out.println("For calculation it takes "+ (time2-time1) +" nano seconds");
    }
}
