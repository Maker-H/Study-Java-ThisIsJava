package sec03.exam02_default_method_use;

public class M_RemoteControlExample {
    public static void main(String[] args) {
        RemoteControl rc = null;
        
        rc = new Television();
        rc.setMute(true);
        
        rc = new Audio();
        rc.setMute(true);
    }
}
