public class Ch5_StringEqualsExample {
    public static void main(String[] args) {
        String strVar1 = "신민철";
        String strVar2 = "신민철"; //refer same object

        if(strVar1 == strVar2) {
            System.out.println("strVar1 and strVar2 refer same object");
        } else {
            System.out.println("strVar1 and strVar2 refer different object");
        }

        if(strVar1.equals(strVar2)) {
            System.out.println("strVar1 and strVar2 has same stirng");
        }

        String strVar3 = new String("신민철");
        String strVar4 = new String("신민철");

        if(strVar3 ==strVar4) {
            System.out.println("strVar3  and strVar4 has differnt reference");
        }else {
            System.out.println("strVar3 and strVar4 has same reference");
        }
        
        if(strVar3.equals(strVar4)) {
            System.out.println("strVar3 and strVar4 has same string");
        }
    }//end of main
    
}//end of class
