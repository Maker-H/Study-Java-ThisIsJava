package sec04.exam02_field_array;

public class Car {

    //decalre tire interface as array
    Tire[] tires = {
        new HankookTire(),
        new HankookTire(),
        new HankookTire(),
        new HankookTire()
    };

    void run() {
        for(Tire tire : tires) {
            tire.roll(); //roll all tire
        }
    }
    
}
