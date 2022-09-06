public class Ch4_Exercise4_DiceTotalFive{
    public static void main(String[] args){
      int num1;
      int num2;
      int sum=0;

      while(sum!=5) {
        num1=(int)(Math.random()*6)+1;
        num2=(int)(Math.random()*6)+1;
        sum=num1+num2;
        System.out.println("First dice : "+ num1 + " Second dice : " + num2);
      }
    }//end of main    
}//end of class