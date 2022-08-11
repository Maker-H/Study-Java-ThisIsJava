public class Ch6_Car6_GetterSetterExample{
	public static void main(String[] args){
		Lib_Car6 myCar = new Lib_Car6();
		
		//invalid speed change
		myCar.setSpeed(-50); //use setter method

		System.out.println("Current speed : "+myCar.getSpeed());
		
		//valid speed change
		myCar.setSpeed(60);
		
		System.out.println("Current speed : "+myCar.isStop());
		
		if(!myCar.isStop()) {
			myCar.setStop(true);
		}
		System.out.println("Current speed : "+myCar.getSpeed());
	}//end of main
}//end of class
