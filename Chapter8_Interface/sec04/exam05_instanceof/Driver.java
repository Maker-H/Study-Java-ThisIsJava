package sec04.exam05_instanceof;

public class Driver {
    
    //method
    public void drive(Vehicle vehicle) {
        if(vehicle instanceof Bus) //if parameter vehicle refers object bus 
        {
            Bus bus = (Bus) vehicle;
            bus.checkFare(); //runs class self method checkfare
        }
        vehicle.run(); //and call abstract method. 
       
    }
}
