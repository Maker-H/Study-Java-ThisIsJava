public class Ch6_Calculator2_CallMethodInClassEx{
	public static void main(String[] args){
	C_Calculator1 myCal = new C_Calculator1();
	myCal.powerOn();


	int result1 = myCal.plus(5,6);
	System.out.println("result1 : " + result1);

	byte x = 10;
	byte y = 4;
	double result2 = myCal.divide(x,y);
	System.out.println("result2 : "+ result2);

	myCal.powerOff();


	}//end of main
}//end of class
