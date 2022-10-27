package sec06.exam05_wait_notify;

public class DataBox {
    //Field
    private String data;
    
    //Method
    public synchronized String getData(){
        if(this.data == null) {
            try{
                wait();
            } catch(InterruptedException e) {}
        } //IF data field is null pause this thead
        
        String returnValue = data;
        System.out.println("Consumer Thread read "+ returnValue);
        data = null;
        notify(); // make other thread runnable
        return returnValue;
    } 

    public synchronized void setData(String data){
        if(this.data != null) {
            try{
                wait();
            }catch(InterruptedException e) {}
        }
        this.data = data;
        System.out.println("ProducerThread made "+data);
        notify(); //make current thread runnable and run other thread
    }

    
}
