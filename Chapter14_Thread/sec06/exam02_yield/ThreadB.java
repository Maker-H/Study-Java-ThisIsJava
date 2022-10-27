package sec06.exam02_yield;

public class ThreadB extends Thread{
    public boolean stop = false;
    public boolean work = true;

    public void run() {

        while(!stop){
            if(work) {
                System.out.println("Details of ThreadB");
            } else {
                Thread.yield();
            }
        }
        System.out.println("shut down system of ThreadB");
    }
}
