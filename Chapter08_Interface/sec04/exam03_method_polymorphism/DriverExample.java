package sec04.exam03_method_polymorphism;

public class DriverExample {
    public static void main(String[] args) {
        Taxi taxi = new Taxi(); //make object
        Bus bus = new Bus(); //make object
        Driver driver = new Driver(); //make implement object

        driver.drive(taxi);

        driver.drive(bus);

    }
}
