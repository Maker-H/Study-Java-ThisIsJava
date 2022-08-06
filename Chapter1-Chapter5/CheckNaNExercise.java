public class CheckNaNExercise{
    public static void main(String[] args){
       double x = 5.0;
       double y = 0.0;

       double z = x % y;

       if(Double.isNaN(z)) {
        System.out.println("can't be divide by 0.0");
       } else {
        double result = z + 10;
        System.out.println(("result"+result));
       }
    }


    
}