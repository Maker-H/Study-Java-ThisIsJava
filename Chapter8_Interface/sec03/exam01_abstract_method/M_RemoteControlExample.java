package sec03.exam01_abstract_method;

public class M_RemoteControlExample {
    public static void main(String[] args) {
        RemoteControl rc = null;
        
        rc = new Television();
        rc.turnOff();
        rc.turnOn();
        
        rc = new Audio();
        rc.turnOff();
        rc.turnOn();
    }
}
