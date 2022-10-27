package sec04.exam01_unsynchronized;

public class Calculator {
    //Field
    private int memory;

    //Method
    public int getMemory() {
        return memory;
    }

    public synchronized void setMemory(int memory){
        this.memory=memory;
        try{
            Thread.sleep(2000);
        }catch(InterruptedException e) {}
        System.out.println(Thread.currentThread().getName()+" : "+this.memory);
        
    }


}
