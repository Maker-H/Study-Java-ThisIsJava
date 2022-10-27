package sec02.exam02_interface;

public class CarAgency implements Rentable<Car>{

    @Override
    public Car rent() {
        return new Car();
    }
    
    
}
