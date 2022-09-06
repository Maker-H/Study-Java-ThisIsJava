package sec04.exam05_instanceof;

public class DriverExample {
    public static void main(String[] args) {
        Driver driver = new Driver();    
        Vehicle vehicle = new Bus();
        driver.drive(vehicle);

        System.out.println("-------");

        vehicle = new Taxi();
        driver.drive(vehicle);

    }
}
