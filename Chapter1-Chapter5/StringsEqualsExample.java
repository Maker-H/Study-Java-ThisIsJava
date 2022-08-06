
public class StringsEqualsExample{
    public static void main(String[] args){
       String strVar1 = "james";
       String strVar2 = "james";
       String strVar3 = new String("james"); 

       System.out.println(strVar1 == strVar2);
       System.out.println(strVar1 == strVar3);
       System.out.println();
       System.out.println(strVar1.equals(strVar2));
       System.out.println(strVar1.equals(strVar3));

    }


    
}