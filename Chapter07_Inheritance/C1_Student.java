public class C1_Student extends P1_People
{
	//Field
	public int studentNo;

	//Constructor
	public C1_Student(String name, String ssn, int studentNo) { 
		super(name,ssn); //call People directly because people have no basic constructor
		this.studentNo = studentNo;
	}

}//end of class
