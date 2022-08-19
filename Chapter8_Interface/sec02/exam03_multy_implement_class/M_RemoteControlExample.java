package sec02.exam03_multy_implement_class;

public class M_RemoteControlExample{
    public static void main (String[] args){
        C_SmartTelevision tv = new C_SmartTelevision();//create object from class which implements remotecontrol and smarttv

        RemoteControl rc = tv; //make interface variable and allocate implement class object
        rc.turnOff();
        rc.turnOn();


        Searchable searchable = tv; //make interface variable and allocate implement class object
        searchable.search("www.naver.com");
    }
}