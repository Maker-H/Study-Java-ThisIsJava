public class Ch6_Calculator4_StaticExample{
	public static void main(String[] args){
	double result1 = 10 * 10 * Lib_Calculator4.pi;
	int result2 = Lib_Calculator4.plus(10, 5); 
	int result3 = Lib_Calculator4.minus(10,5);
	//do not generate new object. just use class name to use static method

	System.out.println("result1 : "+result1);
	System.out.println("result2 : "+result2);
	System.out.println("result3 : "+result3);
	
	
	}//end of main
}//end of class
