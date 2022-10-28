package sec02_mainthread.exam01_createthread;

public class BeepPrintExample4_Extends {
    public static void main(String[] args) {
        Thread thread = new BeepThread();
        thread.start();

        for(int i=0;i<5;i++){
            System.out.println("ding");
            try{Thread.sleep(500);} catch(Exception e) {
                
            }
        }
    }
}
