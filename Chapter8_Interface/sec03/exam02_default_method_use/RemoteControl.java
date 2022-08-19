package sec03.exam02_default_method_use;

public interface RemoteControl {
    //constant (static final) 
    public int MAX_VOLUME = 10;
    public int MIN_VOLUME = 10;

    //abstract method
    public void turnOn();
    public void turnOff();
    public void setVolume(int volume);

    //default method //must need implement object
    default void setMute(boolean mute) {
        if(mute) { //if true
            System.out.println("set mute");
        } else {
            System.out.println("release mute");
        }
    }

    //static method
    static void changeBattery() {
        System.out.println("change battery");
    }
}
