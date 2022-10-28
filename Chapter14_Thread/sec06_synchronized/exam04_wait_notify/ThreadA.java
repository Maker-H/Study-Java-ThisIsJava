package sec06_synchronized.exam04_wait_notify;

public class ThreadA extends Thread{
    //Field
    private WorkObject workobject;

    //Constructor
    public ThreadA(WorkObject workobject) {
        this.workobject = workobject;
    }


    //Automatic Run
    @Override
    public void run() {
        for(int i=0; i<10; i++) {
            workobject.methodA();
        }
    }
    
}
