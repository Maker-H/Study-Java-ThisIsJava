package sec04.exam04_casting;

public class DriverExample {
    public static void main(String[] args) {
        
        Vehicle vehicle = new Bus(); //allocate implement object 
        vehicle.run(); //run abstract method

        //vehicle.checkFare(); //have to cast
        Bus bus = (Bus) vehicle; //cast interface var to class var 

        bus.run();
        bus.checkFare();



    }
}
