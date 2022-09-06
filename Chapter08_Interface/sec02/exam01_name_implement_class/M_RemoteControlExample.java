package sec02.exam01_name_implement_class;

public class M_RemoteControlExample {
    public static void main(String[] args) {
        RemoteControl rc;
        rc = new Television();
        rc = new Audio();

        rc.turnOff();
        rc.turnOn();
    }
}
