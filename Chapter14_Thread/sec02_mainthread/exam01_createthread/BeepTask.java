package sec02_mainthread.exam01_createthread;

import java.awt.*;
public class BeepTask implements Runnable{
    
    //Method
    public void run() {
        Toolkit toolkit = Toolkit.getDefaultToolkit();

        for(int i=0; i<5; i++) {
            toolkit.beep();
            try { Thread.sleep(500);} catch(Exception e) {}
        }
    }
}
