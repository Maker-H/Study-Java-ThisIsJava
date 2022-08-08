public class Ch6_Car2_ConstructorOverload{
	public static void main(String[] args){
		C_Car2 car1 = new C_Car2(); //Use default consturctor
		System.out.println("Car1. company : "+car1.company);
		System.out.println();
		
		C_Car2 car2 = new C_Car2("SUV"); //Use consturctor overloading
		System.out.println("car2.company : "+ car2.company);
		System.out.println("car2.model : "+ car2.model);
		System.out.println();
		
		C_Car2 car3 = new C_Car2("Sedan", "Cream");
		System.out.println("car3.company : "+ car3.company);
		System.out.println("car3.color : "+ car3.color);
		System.out.println("car3.model : "+ car3.model);
		System.out.println();
		
		C_Car2 car4 = new C_Car2("Sedan", "Cream", 250);
		System.out.println("car4.company : "+ car4.company);
		System.out.println("car3.color : "+ car3.color);
		System.out.println("car4.model : "+ car4.model);
		System.out.println("car4.model : "+ car4.maxSpeed);
		System.out.println();
		
	}//end of main
}//end of class
