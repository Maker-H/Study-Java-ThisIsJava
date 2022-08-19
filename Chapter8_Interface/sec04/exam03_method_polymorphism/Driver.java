package sec04.exam03_method_polymorphism;

public class Driver {
    
    //method
    public void drive(Vehicle vehicle) {
        vehicle.run(); //call abstract method. 
        //if implement object a is called a's run method will be processed
    }
}
