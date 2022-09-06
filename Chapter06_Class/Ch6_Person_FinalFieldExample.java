public class Ch6_Person_FinalFieldExample{
	public static void main(String[] args){
		Lib_Person p1 = new Lib_Person("123456-1234567", "heesom"); //create object

		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);

		//p1.nation = "US";
		//p1.ssn = "000000-222222";
		p1.name = "bring it on";


	}//end of main
}//end of class
