package sec04.exam05_instanceof;

public class Bus implements Vehicle{

    //override abstract method
    @Override
    public void run() {
        System.out.println("bus runs");   
    }

    //class method
    public void checkFare() {
        System.out.println("check fare");
    }
    
}
