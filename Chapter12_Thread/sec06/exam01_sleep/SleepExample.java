package sec06.exam01_sleep;

import java.awt.*;
public class SleepExample {
    public static void main(String[] args) {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        for(int i=0; i<10; i++) {
            toolkit.beep();
            try{
                Thread.sleep(300);
            }catch(InterruptedException e) {}
        }
    }
}
