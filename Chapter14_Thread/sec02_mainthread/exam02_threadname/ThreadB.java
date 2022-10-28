package sec02_mainthread.exam02_threadname;

public class ThreadB extends Thread{
    //Constructor
    public ThreadB() {
        setName("ThreadB");
    }

    //Method
    public void run() {
        for(int i=0; i<2; i++){
            System.out.println(getName());
        }
    }
}
