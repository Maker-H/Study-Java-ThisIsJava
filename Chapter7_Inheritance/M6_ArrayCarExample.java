public class M6_ArrayCarExample
{
	public static void main(String[] args){
		Lib6_ArrayCar car = new Lib6_ArrayCar(); //default lifespan is 6,2,3,4
	
		for(int i=0; i<6; i++) { //runs the car
			int problemLocation = car.run(); //if car stops return 1~4, if runs return 0 
			//first goes to Lib6_ArrayCar 
			
			if(problemLocation!=0) { //if car stops
				System.out.println(car.tires[problemLocation-1].location+"is changed by HankookTire"); 

				car.tires[problemLocation-1] = new C6_ArrayHankookTire(car.tires[problemLocation].location, 15); //change tire
			}
			System.out.println("---------------------");//if car keep rooling 
			
		}//end of loop
	}//end of main
}//end of class
