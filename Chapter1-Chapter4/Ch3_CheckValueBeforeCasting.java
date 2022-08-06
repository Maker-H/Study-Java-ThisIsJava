public class Ch3_CheckValueBeforeCasting{
    
    public static void main(String[] args){
        int i =128;

        if((i<Byte.MIN_VALUE)||(i>Byte.MAX_VALUE)){ //if i>127, i<-128
            System.out.println("cannot convert to byte  value");
            System.out.println("Check Value Again");
        }else{
            byte b = (byte) i;
            System.out.println(b);
        }
       
    }
}