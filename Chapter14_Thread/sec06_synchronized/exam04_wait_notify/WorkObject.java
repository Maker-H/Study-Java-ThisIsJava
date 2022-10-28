package sec06_synchronized.exam04_wait_notify;

public class WorkObject {
    //Method
    public synchronized void methodA () {
        System.out.println("Run methodA of ThreadA");
        notify(); //this line is runned by threadA so notify() notifies another thread, ThreadB, and Thread A waits
        try{
            wait();
        }catch (InterruptedException e) {
        }
    }

    public synchronized void methodB() {
        System.out.println("Run methodB of ThreadB");
        notify();
        try{
            wait();
        }catch (InterruptedException e) {
        }
    }
}
