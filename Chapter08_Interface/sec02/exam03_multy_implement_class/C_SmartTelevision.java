package sec02.exam03_multy_implement_class;

public class C_SmartTelevision implements RemoteControl, Searchable{
    private int volume; 
        
    @Override
    public void turnOn() {
        System.out.println("turn on the TV");
    }
    
    @Override
    public void turnOff() {
        System.out.println("turn off the TV");
    }

    @Override
    public void setVolume(int volume) {
        if(volume>RemoteControl.MAX_VOLUME) { //if vol is louder than 10 fix to 10
            this.volume = 10;
        } else { //if vol is lesser than 0 fix to 0
            this.volume = 0;
        }
        System.out.println("Current volume : " + this.volume);
    }

    @Override
    public void search(String url) {
        System.out.println("search "+url);
        
    }

    
    
}//end of class
