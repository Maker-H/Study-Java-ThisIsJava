package sec05_state;

import java.awt.*;
public class ThreadStateExample {
    public static void main(String[] args) {
        StatePrintThread stateprintthread = new StatePrintThread(new TargetThread());

        stateprintthread.start();
    }
}
