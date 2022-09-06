public class Lib6_ArrayCar
{
	//Field
	P6_ArrayTire[] tires = {
		new P6_ArrayTire("Front-Left",6),
		new P6_ArrayTire("Front-Right",2),
		new P6_ArrayTire("Back-Left",3),
		new P6_ArrayTire("Back-Left",4)
	};

	//Method
	int run() { //roll all tires
		System.out.println("[Car runs]");
		for(int i=0; i<tires.length; i++) {
			if(tires[i].roll()==false) {
				stop();
				return (i+1);
			}
		}//end of loop
		return 0;
	}

	void stop() {
		System.out.println("[Car is stopping]");
	}


	
}//end of class
