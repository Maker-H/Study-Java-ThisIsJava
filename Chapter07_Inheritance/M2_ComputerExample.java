public class M2_ComputerExample
{
	public static void main(String[] args){
		int r =10;

		P2_Calculator calculator = new P2_Calculator();
		System.out.println("call method of object Calculator : "+calculator.areaCircle(r));
		System.out.println();
		
		C2_Computer computer = new C2_Computer();
		System.out.println("call method of object Computer : " + computer.areaCircle(r)); //calling overrided method
		System.out.println();
		
		


	}//end of main
}//end of class
