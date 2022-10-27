package sec05.exam01_state;

import java.awt.*;
public class StatePrintThread extends Thread {
    private Thread targetThread;
    
    //Constructor
    public StatePrintThread(TargetThread targetThread) {
        this.targetThread = targetThread;
    }

    public void run() {
        while(true) {
            Thread.State state = targetThread.getState();
            System.out.println("State of Target Thread "+ state);

            if(state == Thread.State.NEW) {
                targetThread.start();
            }
            if(state == Thread.State.TERMINATED){
                break;
            }

            try {
                Thread.sleep(500);
            }catch(Exception e){}
        }
    }
}
