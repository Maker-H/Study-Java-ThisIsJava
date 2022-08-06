public class ContinueExample{
    public static void main(String[] args) {
      for(int i=1;i<=10;i++) {
        if(i%2 !=0) { //if i is odd num, skip
          continue;
        }
        System.out.println(i);
      }//end of loop
    } //end of main
}//end of class