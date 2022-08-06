public class Ch3_InputDataCheckNaNExaple2{
    public static void main(String[] args){
       String userInput = "NaN"; //userinput
       double val = Double.valueOf(userInput); //convert input to double
    
       double currentBalance = 10000.0; 

       if(Double.isNaN(val)) { //check if its NaN
        System.out.println("n has entered and cannot be processed");
        val = 0.0;
       }

       currentBalance +=val;
      // System.out.println(currentBallance); //NaN is not a num so error occurs
    }


    
}