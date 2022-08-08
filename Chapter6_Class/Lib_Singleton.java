public class Lib_Singleton{
    //Field 
    private static Lib_Singleton singleton = new Lib_Singleton();

    //Constructor
    private Lib_Singleton(){}

    //method
    static Lib_Singleton getInstance(){
        return singleton;
    }
	
}//end of class
