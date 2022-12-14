public class Ch3_BitReverseOperatorExample{
    public static void main(String[] args){
        int v1 = 10;
        int v2 = ~v1;
        int v3 = ~v1 + 1;
        System.out.println(toBinaryString(v1)+"(Decimal Num : " + v1 + ")");
        System.out.println(toBinaryString(v2)+"(Decimal Num : " + v2 + ")");
        System.out.println(toBinaryString(v3)+"(Decimal Num : " + v3 + ")");
    }


    public static String toBinaryString(int value){
        String str = Integer.toBinaryString(value);
        
        //32 is number which is size of integear
        //if the length of str is smaller than 32 add 0 at front 
        while(str.length()<32){ 
            str = "0" + str;
        }
        return str;
    }
}