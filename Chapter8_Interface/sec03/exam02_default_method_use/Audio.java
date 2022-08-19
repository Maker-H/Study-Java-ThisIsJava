package sec03.exam02_default_method_use;

public class Audio implements RemoteControl{
    //Field
    private int volume; //store value 0~10
    private boolean mute;

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

    //override default method 
    @Override
    public void setMute(boolean mute) {
        this.mute = mute;
        if(mute) { //if true
            System.out.println("Audio set mute");
        } else {
            System.out.println("Audio release mute");
        }
    }

    

    
}


