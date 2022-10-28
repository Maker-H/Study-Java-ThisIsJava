package sec06_synchronized.exam05_wait_notify;

public class ProducerThread extends Thread{
    //Field
    private DataBox databox;

    //Constructor
    public ProducerThread (DataBox databox) {
        this.databox = databox;
    }

    @Override
    public void run() {
        for(int i=0;i<4;i++) {
            String data = "Data-"+i;
            databox.setData(data);
        }
    }    
}
