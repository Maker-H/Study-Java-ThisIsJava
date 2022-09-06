package sec04.exam04_casting;

public class Bus implements Vehicle{

    //override abstract method
    @Override
    public void run() {
        System.out.println("bus runs");   
    }

    //make own method
    public void checkFare() {
        System.out.println("check fare");
    }

    
}
