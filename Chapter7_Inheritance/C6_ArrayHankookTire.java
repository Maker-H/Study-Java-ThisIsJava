public class C6_ArrayHankookTire extends P6_ArrayTire
{
	//Contructor
	public C6_ArrayHankookTire(String location, int maxRotation) {
		super(location, maxRotation); //no default constructor at parent class
	}

	//Method
	@Override
	public boolean roll(){
		++accumulatedRotation;
		if(accumulatedRotation<maxRotation) {
			System.out.println(location+ " Hankook tire lifespan : "+(maxRotation-accumulatedRotation));
			return true;
		} else {
			System.out.println("****"+location+"Flat Hankook tire ****");
			return false;
		}
	}


}//end of class
