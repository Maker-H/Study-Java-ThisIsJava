package sec02_mainthread.exam02_threadname;

public class ThreadA extends Thread{
    //Constructor
    public ThreadA() {
        setName("ThreadA");
    }

    //Method
    public void run() {
        for(int i=0; i<2; i++){
            System.out.println(getName());
        }
    }
}
