public class P6_ArrayTire
{
	//Field
	public int maxRotation; //tire lifespan
	public int accumulatedRotation;
	public String location; //tire location

	//Constructor
	public P6_ArrayTire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}

	//Method
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation<maxRotation) { //if there is more life expectatncy  of tire
			System.out.println(location+ " Tire lifespan : "+(maxRotation-accumulatedRotation));
			return true;
		} else {
			System.out.println("****"+location+"Flat tire ****");
			return false;
		}

	}

	
}//end of class
