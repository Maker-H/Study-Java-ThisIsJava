public class Ch6_Car4_CallMethodOutsideClass{
	public static void main(String[] args){
		Lib_Car4 myCar = new Lib_Car4(); //make object
		myCar.keyTurnOn(); //print turn the key
		myCar.run();//assign value to myCar.speed field
		int speed = myCar.getSpeed();//get value of speed
		System.out.println("Current speed : "+speed+"km.h");
	}//end of main
}//end of class
