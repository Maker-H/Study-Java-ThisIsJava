public class M5_CarExample
{
	public static void main(String[] args){
	Lib5_Car car = new Lib5_Car(); //default lifespan is 6,2,3,4
	
		for(int i=0; i<6; i++) { //runs the car
			int problemLocation = car.run(); //if car stops return 1~4, if runs return 0 
			//first goes to Lib5_Car 
		
			switch(problemLocation){ //if gets flat tire
				case 1:
				System.out.println("Front-Left is changed by Hankooktire");
				car.frontLeftTire = new C5_HankookTire("Front-Left", 15);
				break;
				case 2:
				System.out.println("Front-Right is changed by Kumhotire");
				car.frontRightTire = new C5_KumhoTire("Front-Right", 13);
				break;
				case 3:
				System.out.println("Back-Left is changed by Hankooktire");
				car.backLeftTire = new C5_HankookTire("Back-Left", 14);
				break;
				case 4:
				System.out.println("Back-Right is changed by Kumhotire");
				car.backRightTire = new C5_HankookTire("Back-Right", 17);
				break;
			}//end of switch
			System.out.println("---------------------------");//if return 0, car runs
		}//end of loop

	}//end of main
}//end of class
