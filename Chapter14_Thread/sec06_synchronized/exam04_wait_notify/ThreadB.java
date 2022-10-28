package sec06_synchronized.exam04_wait_notify;

public class ThreadB extends Thread{
    //Field
    private WorkObject workobject;

    //Constructor
    public ThreadB(WorkObject workobject) {
        this.workobject = workobject;
    }

    @Override
    public void run() {
        for(int i=0; i<10; i++) {
            workobject.methodB();
        }
    }
    
}
