public class Ch4_Exercise3_MultipleofThree{
    public static void main(String[] args){
      int sum = 0; 
      for(int i=1;i<=100;i++) {
        if(i%3==0) { //if i is multiple of 3
          sum+=i;
        } 
       } //end of loop
       System.out.println("The total is "+sum);
    }//end of main    
}//end of class