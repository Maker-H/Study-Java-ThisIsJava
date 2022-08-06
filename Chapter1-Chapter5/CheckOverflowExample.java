public class CheckOverflowExample{
    public static void main(String[] args){
        try {
            int result = safeAdd(2000000000,2000000000);
            System.out.println(result );
        } catch(ArithmeticException e) {
            System.out.println("Overflow has occured and cannot be accurately calculated");
            //exception handling
        }
    }


    public static int safeAdd(int left, int right)
    {
        if ((right>0)){
            if(left>Integer.MAX_VALUE - right){ //if right+left>int_max
                throw new ArithmeticException("Overflow occurs"); //exception occured
            }
        }else { //if right<=0
            if(left<(Integer.MIN_VALUE - right)) { //if right+left<int_min
                throw new ArithmeticException("Overflow occurs"); //exception occured
            }
        }
        return left + right;
    }
}