public class Lib_Car2{
	//Field
	String company = "bently";
	String model;
	String color;
	int maxSpeed;

	//Default Constructor
	Lib_Car2(){
	}

	//Consturctor Overloading
	Lib_Car2(String model) {
		this(model,"Cream",250);
	}
	
	Lib_Car2(String model, String color) {
		this(model,color,250);
	}

	Lib_Car2(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}

}//end of class
