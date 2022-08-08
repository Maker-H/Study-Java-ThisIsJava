public class Lib_Singleton{
	//Field
    private static Lib_Singleton singleton = new Lib_Singleton();

    //Constructor
    private Lib_Singleton() {}

    //method
    //return value is object of Lib_Singleton, so I can consider type of value as Lib_Singleton
    static Lib_Singleton getInstance() {
        return singleton;
    }
}//end of class
