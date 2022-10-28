package sec06_synchronized.exam06_stop;

public class PrintThread1 extends Thread{
    //Field 
    private boolean stop;

    public void setStop(boolean stop) {
        this.stop = stop;
    }

    @Override
    public void run() {
        while(!stop){
            System.out.println("Running");
        }
        System.out.println("Clean up Resource");
        System.out.println("End Program");
    }
}
