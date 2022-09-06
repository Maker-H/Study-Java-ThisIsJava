public class M3_SupersonicAirplaneExample
{
	public static void main(String[] args){
		C3_SupersonicAirplane sa = new C3_SupersonicAirplane();
		sa.takeoff();
		sa.fly();
		sa.flyMode = C3_SupersonicAirplane.SUPERSONIC; //use classname because it's static variable
		sa.fly();
		sa.flyMode = C3_SupersonicAirplane.NORMAL;
		sa.fly();
		sa.land();

	}//end of main
}//end of class
