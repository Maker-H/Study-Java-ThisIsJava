package sec01.exam03_abstract_method;

public interface RemoteControl {
    //constant (static final) 
    public int MAX_VOLUME = 10;
    public int MIN_VOLUME = 10;

    //absract method
    public void turnOn();
    public void turnOff();
    public void setVolume(int volume);
}
