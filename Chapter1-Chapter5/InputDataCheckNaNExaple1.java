public class InputDataCheckNaNExaple1{
    public static void main(String[] args){
       String userInput = "NaN"; //userinput
       double val = Double.valueOf(userInput); //convert input to double

       double currentBalance = 10000.0; 

       currentBalance +=val;
      // System.out.println(currentBallance); //NaN is not a num so error occurs
    }


    
}