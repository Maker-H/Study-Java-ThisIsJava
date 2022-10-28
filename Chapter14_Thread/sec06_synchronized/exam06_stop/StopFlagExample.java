package sec06_synchronized.exam06_stop;

public class StopFlagExample {
    public static void main(String[] args) {
        PrintThread1 printthread = new PrintThread1();
        printthread.start();
        try{Thread.sleep(100);} catch (InterruptedException e) {}
        printthread.setStop(true);
    }
    
}
