package sec02.exam02_noname_implement_class;

public class M_RemoteControlExample {
    public static void main(String[] args){ 
    RemoteControl rc = new RemoteControl() {
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

        public void otherMethod() {} //even if this is public method it can be used only in this block
        
    };
    RemoteControl rc1 = new RemoteControl() {
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

        public void otherMethod() {} //even if this is public method it can be used only in this block
        
    };

    //rc.volume; //cannot use
}//end of main
}//end of class
