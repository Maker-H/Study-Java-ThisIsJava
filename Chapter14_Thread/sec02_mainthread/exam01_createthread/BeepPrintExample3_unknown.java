package sec02_mainthread.exam01_createthread;
import java.awt.*;
public class BeepPrintExample3_unknown {
    public static void main(String[] args) {
        
        Thread thread = new Thread(new Runnable() {

            @Override
            public void run() {
                Toolkit  toolkit = Toolkit.getDefaultToolkit();
                for(int i=0; i<5; i++) {
                    toolkit.beep();
                    try{Thread.sleep(500);} catch(Exception e){}
                }
                
            }
            
        });

        thread.start();
        for(int i=0; i<5; i++) {
            System.out.println("ding");
            try {Thread.sleep(500);} catch(Exception e) {}
        }
    }
}