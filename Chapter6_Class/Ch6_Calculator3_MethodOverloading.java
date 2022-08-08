public class Ch6_Calculator3_MethodOverloading{
	public static void main(String[] args){
	Lib_Calculator3 myCal = new Lib_Calculator3();
	
	//find the area of a square
	double result1 = myCal.areaRectangle(10);

	//find the area of a rectangle
	double result2 = myCal.areaRectangle(10,20);

	//result ouput
	System.out.println("Area of square : "+result1);
	System.out.println("Area of rectangle : "+result2);


	}//end of main
}//end of class
