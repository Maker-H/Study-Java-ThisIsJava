package sec04.exam02_anonymous_implements;

public class AnonymousExample {
    public static void main(String[] args) {
        Anonymous anon = new Anonymous();

        //use anonymous object field
        anon.field.turnOn();
        anon.field.turnOff();


        //use anonymous local var
        anon.methodAudio();

        //use anonymous object parameter
        anon.methodSmartTv(
            new RemoteControl() {

                @Override
                public void turnOn() {
                    System.out.println("Turn on the Smart TV");
                    
                }

                @Override
                public void turnOff() {
                    System.out.println("Turn off the Smart TV");
                    
                }
                
            }
        );
    }
}
