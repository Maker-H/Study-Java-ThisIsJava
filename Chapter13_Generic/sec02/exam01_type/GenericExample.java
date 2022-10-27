package sec02.exam01_type;

import java.security.Policy;

public class GenericExample {
    public static void main(String[] args) {
        Product<Tv, String> product1 = new Product<>();
        product1.setKind(new Tv());
        product1.setModel("smart TV");

        Tv tv = product1.getKind();
        String tvmodel = product1.getModel();

        //--------------------------------------------
        Product<Car, String> product2 = new Product<>();
        product2.setKind(new Car());
        product2.setModel("SUV");

        Car car = product2.getKind();
        String carmodel = product2.getModel();
    }
}
