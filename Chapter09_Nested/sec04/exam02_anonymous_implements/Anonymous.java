package sec04.exam02_anonymous_implements;


public class Anonymous {
    //as field
    RemoteControl field = new RemoteControl() {

        @Override
        public void turnOn() {
            System.out.println("Turn on the TV");
            
        }

        @Override
        public void turnOff() {
            System.out.println("Turn off the TV");
            
        }
        
    };

    //as local variable
    void methodAudio() {
        //declare interface 
        RemoteControl localVar = new RemoteControl() {

            @Override
            public void turnOn() {
                System.out.println("Turn on the Audio");
                
            }

            @Override
            public void turnOff() {
                System.out.println("Turn off the Audio");
                
            }
            
        };
        //use localvar
        localVar.turnOn();
        localVar.turnOff();
    }

    void methodSmartTv(RemoteControl rc) {
        rc.turnOn();
        rc.turnOff();
        
    }

}
