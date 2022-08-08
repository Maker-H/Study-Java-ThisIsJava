public class C_Car1{
	//Field
	String company = "bently";
	String model;
	String color;
	int maxSpeed;

	//Default Constructor
	C_Car1(){
	}

	//Consturctor Overloading
	C_Car1(String model) {
		this.model = model;
		this.color = color;
	}

	C_Car1(String model, String color) {
		this.model = model;
		this.color = color;
	}

	C_Car1(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}

}//end of class
