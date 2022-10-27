package sec02.exam01_createthread;
import java.awt.*;
public class BeepPrintExample1_Direct {
    public static void main(String[] args) {
        
        Toolkit toolkit = Toolkit.getDefaultToolkit();     
        
        for(int i=0; i<5; i++) {
            toolkit.beep();
            try{Thread.sleep(500);} catch(Exception e) {}
        }

        for(int i=0; i<5; i++) {
            System.out.println("ding");
            try {Thread.sleep(500);} catch(Exception e) {}
        }
    }
}