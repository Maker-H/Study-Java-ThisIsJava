public class M7_AbstractAnimal
{
	public static void main(String[] args){
		C7_Cat cat = new C7_Cat();
		C7_Dog dog = new C7_Dog();
		dog.sound();
		cat.sound();
		System.out.println("--------");
		
		//Promotion
		P7_AbstractAnimal animal = null;
		animal = new C7_Dog(); //promote new dog to animal 
		animal.sound();
		
		animal = new C7_Cat(); //promote new cat to animal
		animal.sound();
		System.out.println("--------");

		//call new method
		animalSound(new C7_Cat()); //promte new cat to aniaml through parameters
		animalSound(new C7_Dog()); //promote new dog to animal through parameters
		
		
	}//end of main

	public static void animalSound(P7_AbstractAnimal animal) {
		animal.sound();
	}
}//end of class
