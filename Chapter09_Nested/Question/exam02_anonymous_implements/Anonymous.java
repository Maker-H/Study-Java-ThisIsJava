package Question.exam02_anonymous_implements;

public class Anonymous {
    
    //anonymous implements in field
    Vehicle field = new Vehicle() {
        @Override
        public void run() {
            System.out.println("Bycicle is running");
        }
    };

    //anonymous implements in method
    void method1() {
        Vehicle localVar  = new Vehicle() {

            @Override
            public void run() {
                System.out.println("Car is running");
                
            }
        };
        localVar.run();
    }

    //anonymous implements in parameter
    void method2(Vehicle v) {
        v.run();
    }

}
