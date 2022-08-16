public class C7_Cat extends P7_AbstractAnimal
{
	//Constructor 
	public C7_Cat() {
		this.kind = "mammal";
	}

	//method
	//abstracted method
	@Override
	public void sound() {
		System.out.println("meeeowwwww");
	}
}//end of class
