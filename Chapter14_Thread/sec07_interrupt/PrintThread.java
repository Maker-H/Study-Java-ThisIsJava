package sec07_interrupt.exam01_interrupt;

public class PrintThread extends Thread{
    @Override
    public void run() {
        while(true){
            System.out.println("Running");
            //Thread.sleep(300);

            if(Thread.interrupted()){
                break;
            }
        }
        System.out.println("Gather resourse");
        System.out.println("End of Program");

    }
}
