public class Lib5_Car
{
	//Field
	P5_Tire frontLeftTire = new P5_Tire("Front-Left", 6);
	P5_Tire frontRightTire = new P5_Tire("Front-Right", 2);
	P5_Tire backLeftTire = new P5_Tire("Back-Left", 3);
	P5_Tire backRightTire = new P5_Tire("Back-Right", 4);

	//Method
	int run() {
		System.out.println("[Car runs]");
		if(frontLeftTire.roll()==false) {stop(); return 1;}
		if(frontRightTire.roll()==false) {stop(); return 2;}
		if(backLeftTire.roll()==false) {stop(); return 3;}
		if(backRightTire.roll()==false) {stop(); return 4;}
		return 0;
		//roll() is checking whether tire is flat or not
	}

	void stop() {
		System.out.println("[Car is stopping]");
	}


	
}//end of class
