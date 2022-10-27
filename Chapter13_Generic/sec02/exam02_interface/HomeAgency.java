package sec02.exam02_interface;

public class HomeAgency implements Rentable<Home>{

    @Override
    public Home rent() {
        return new Home();
    }
    
}
