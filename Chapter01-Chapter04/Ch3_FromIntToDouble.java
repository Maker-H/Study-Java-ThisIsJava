public class Ch3_FromIntToDouble{
    
    public static void main(String[] args){
    int num1 = 123456780;
    int num2 = 123456780;

    double num3 = num2; //promotion occurs
    num2 = (int)num3; //Casting occurs

    int result = num1-num2;
    System.out.println(result);
    }
}