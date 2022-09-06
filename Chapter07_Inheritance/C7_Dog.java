public class C7_Dog extends P7_AbstractAnimal
{
	//Constructor 
	public C7_Dog() {
		this.kind = "mammal";
	}

	//method
	//abstracted method
	@Override
	public void sound() {
		System.out.println("woooofffff");
	}
}//end of class
