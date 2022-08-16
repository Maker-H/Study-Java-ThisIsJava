public class M4_ChildExample
{
	public static void main(String[] args){
		C4_Child child = new C4_Child();

		P4_Parent parent = child; //parent points the same chlid but used only by P4_Parent = promotion
		parent.method1();
		parent.method2(); //call overrided method
		//parent.method3(); // can't call whether parent points chlid but used by P4_Parent type
	}//end of main
}//end of class
