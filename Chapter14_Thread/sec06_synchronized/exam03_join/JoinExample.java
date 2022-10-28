package sec06_synchronized.exam03_join;

public class JoinExample {
    public static void main(String[] args) {
        SumThread sumthread = new SumThread();
        sumthread.start();

        try{
            sumthread.join();
        }catch (InterruptedException e) {}

        System.out.println("Sum of 1 to 100 : "+sumthread.getSum());
    }
}
