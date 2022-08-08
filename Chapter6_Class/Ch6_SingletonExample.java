public class Ch6_SingletonExample{
	public static void main(String[] args){
		/*
		 Lib_Singleton obj = new Lib_Singleton();
		 Lib_Singleton obj1 = new Lib_Singleton();
		 */

		 Lib_Singleton obj1 = Lib_Singleton.getInstance(); //have to use class name. because the method getInstance is static
		 Lib_Singleton obj2 = Lib_Singleton.getInstance();

		 if(obj1==obj2) {
			System.out.println("The same singleton object");
		 }else {
			System.out.println("Differenct singleton object");
		 }
	}//end of main
}//end of class
