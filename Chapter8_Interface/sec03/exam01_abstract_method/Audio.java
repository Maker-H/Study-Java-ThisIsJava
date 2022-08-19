package sec03.exam01_abstract_method;

public class Audio implements RemoteControl{
    //Field
    private int volume; //store value 0~10

    //override abstract method
    @Override
    public void turnOn() {
        System.out.println("turn on the Audio");
    }
    
    @Override
    public void turnOff() {
        System.out.println("turn off the Audio");
    }

    @Override
    public void setVolume(int volume) {
        if(volume>RemoteControl.MAX_VOLUME) { //if vol is louder than 10 fix to 10
            this.volume = 10;
        } else { //if vol is lesser than 0 fix to 0
            this.volume = 0;
        }
        System.out.println("Current Audio volume : " + this.volume);
    }
    
}


