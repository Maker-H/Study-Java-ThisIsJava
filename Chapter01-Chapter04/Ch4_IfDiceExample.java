public class Ch4_IfDiceExample{
    public static void main(String[] args){
      int num = (int)(Math.random()*6)+1; //generate random number  between 1~6

      if(num ==1) {
        System.out.println("Got num 1");
      } else if(num==2) {
        System.out.println("Got num 2");
      }  else if(num==3) {
        System.out.println("Got num 3");
      }  else if(num==4) {
        System.out.println("Got num 4");
      }  else if(num==5) {
        System.out.println("Got num 5");
      }  else if(num==6) {
        System.out.println("Got num 6");
      }

    }


    
}