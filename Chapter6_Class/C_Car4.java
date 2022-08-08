public class C_Car4{
	//Field
	int speed;

	//Constructor

	//Method
	int getSpeed() {
		return speed;
	}	

	void keyTurnOn() {
		System.out.println("Turn the key");
	}
	
	void run() { //store value in speed field
		for(int i=0; i<=50; i+=10) {
			speed = i;
			System.out.println("Running.(Hourly speed:"+speed+"km/h");
		}
	}
}//end of class
