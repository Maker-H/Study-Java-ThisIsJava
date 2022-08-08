public class Lib_Car1{
	//Field
	String company = "bently";
	String model;
	String color;
	int maxSpeed;

	//Default Constructor
	Lib_Car1(){
	}

	//Consturctor Overloading
	Lib_Car1(String model) {
		this.model = model;
		this.color = color;
	}

	Lib_Car1(String model, String color) {
		this.model = model;
		this.color = color;
	}

	Lib_Car1(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}

}//end of class
