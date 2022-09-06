package sec04.exam01_field_polymorphism;

public class CarExample {
    public static void main(String[] args) {
        Car myCar = new Car();
        
        myCar.run(); //roll all tires

        //change tire by using implement object
        myCar.frontLeftTire = new KumhoTire();
        myCar.frontRightTire = new KumhoTire();

        myCar.run();
    } 
}
