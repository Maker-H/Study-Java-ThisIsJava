public class Ch6_Computer_ArrayExample{
	public static void main(String[] args){
	Lib_Computer myCom = new Lib_Computer(); //create object

	int[] values = {1,2,3};
	int result1 = myCom.sum1(values);
	System.out.println("result1 : "+ result1);
	
	int result2 = myCom.sum1(new int[] {1,2,3,4});
	System.out.println("result2 : "+ result2);
	
	int result3 = myCom.sum2(1,2,3);
	System.out.println("result3 : "+ result3);
	
	int result4 = myCom.sum2(1,2,3,4,5);
	System.out.println("result4 : "+ result4);


	

	}//end of main
}//end of class
