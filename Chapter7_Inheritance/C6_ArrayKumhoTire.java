public class C6_ArrayKumhoTire extends P6_ArrayTire
{
	//Contructor
	public C6_ArrayKumhoTire(String location, int maxRotation) {
		super(location, maxRotation); //no default constructor at parent class
	}

	//Method
	@Override
	public boolean roll(){
		++accumulatedRotation;
		if(accumulatedRotation<maxRotation) {
			System.out.println(location+ " KumhoTire tire lifespan : "+(maxRotation-accumulatedRotation));
			return true;
		} else {
			System.out.println("****"+location+"Flat KumhoTire tire ****");
			return false;
		}
	}


}//end of class
