public class Lib_Car5{
	//Field
	String model;
	int speed;

	//Constructor
	Lib_Car5(String model) {
		this.model = model;
	}

	//method
	void setSpeed(int speed) {
		this.speed=speed;
	}

	void run() { //this method have to be called by main
		for(int i=0; i<=50; i+=10) {
			this.setSpeed(i);
			System.out.println(this.model+" is running.(Hourly Speed : "+this.speed+"km/h");
		}
	}

}//end of class
