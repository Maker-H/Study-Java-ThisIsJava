package sec02_mainthread.exam01_createthread;
import java.awt.*;
public class BeepPrintExample2_Runnable {
    public static void main(String[] args) {
        
        Runnable beepTask = new BeepTask();
        Thread thread = new Thread(beepTask);
        thread.start();
        
   

        for(int i=0; i<5; i++) {
            System.out.println("ding");
            try {Thread.sleep(500);} catch(Exception e) {}
        }
    }
}