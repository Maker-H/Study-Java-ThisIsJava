package sec06_synchronized.exam05_wait_notify;

public class ConsumerThread extends Thread {
    //Field
    private DataBox databox;

    //Constructor
    public ConsumerThread(DataBox databox) {
        this.databox = databox;
    }

    @Override
    public void run() {
        for(int i=0;i<4;i++) {
            String data = databox.getData();
        }
    }
    
}
