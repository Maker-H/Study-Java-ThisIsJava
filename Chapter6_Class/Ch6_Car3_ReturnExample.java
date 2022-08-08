public class Ch6_Car3_ReturnExample{
	public static void main(String[] args){
		C_Car3 myCar = new C_Car3();

		myCar.setGas(5); //filled up the gas by 5

		boolean gasState = myCar.isLeftGas(); //check for gas remaining

		if(gasState) { //if there is gas
			System.out.println("Let's go");
			myCar.run(); //show car is running
		}

		if(myCar.isLeftGas()) { //check for gas remaining one more time
			System.out.println("No need to charge the gas");
		} else {
			System.err.println("Charge the gas");
		}

	}//end of main
}//end of class
