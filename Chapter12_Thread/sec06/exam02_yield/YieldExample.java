package sec06.exam02_yield;


public class YieldExample {
    public static void main(String[] args) {
        ThreadA threadA = new ThreadA();
        ThreadB threadB = new ThreadB();

        //thread starts
        threadA.start();
        threadB.start();
        
        try{Thread.sleep(30);}catch(InterruptedException e){}
        threadA.work = false; //more opportunity to ThreadA

        try{Thread.sleep(30);}catch(InterruptedException e){}
        threadA.work = true;
        
        try{Thread.sleep(30);}catch(InterruptedException e){}
        threadA.stop = true;
        threadB.stop = true;



    }
}
