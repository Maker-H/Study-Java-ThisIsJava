public class C3_SupersonicAirplane extends P3_Airplane
{
	//Field
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;
	
	public int flyMode = NORMAL; //not static

	//Method
	@Override
	public void fly() {
		if(flyMode == SUPERSONIC) { //defalt of flymode is diff from supersonic
			System.out.println("supersonic flight");
		} else {
			//call fly() of object airplane
			super.fly();
		}
	}

}//end of class
