package sec04.exam02_field_array;

public class CarExample {
    public static void main(String[] args) {
        Car myCar = new Car();
        
        myCar.run(); //roll all tires

        //change tire by using implement object
        myCar.tires[0] = new KumhoTire();
        myCar.tires[1] = new KumhoTire();

        myCar.run();
    } 
}
