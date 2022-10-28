package sec08_daemon;

public class AutoSaveThread extends Thread{
    public void save(){
        System.out.println("Store File");
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                break;
            }
            save(); //call save method to save file for every 1 second
        }
    }
    
}
