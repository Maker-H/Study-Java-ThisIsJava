package sec02.exam01_name_implement_class;

public interface RemoteControl {
    //constant (static final) 
    public int MAX_VOLUME = 10;
    public int MIN_VOLUME = 10;

    //absract method
    public void turnOn();
    public void turnOff();
    public void setVolume(int volume);

    //default method
    default void setMute(boolean mute) {
        if(mute) {
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
