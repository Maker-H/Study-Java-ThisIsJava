public class Lib_Singleton{
    //Field 
    //create new object
    private static Lib_Singleton singleton = new Lib_Singleton(); //used at Method
    

    //Constructor
    private Lib_Singleton(){} //used at Field
    //used only by itself

    //method
    static Lib_Singleton getInstance(){
        return singleton;
    }
	
}//end of class
