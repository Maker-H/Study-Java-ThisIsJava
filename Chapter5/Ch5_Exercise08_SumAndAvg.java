public class Ch5_Exercise08_SumAndAvg {
    public static void main(String[] args) {
        int[][] array = {
            {95,86},
            {83,92,96},
            {78,83,93,87,88}
        };

        int sum = 0;
        double avg = 0.0;

        int count = 0 ;
        for(int i=0; i<array.length; i++) {
            for(int k=0; k<array[i].length; k++) {
                sum+=array[i][k]; 
                count++;
            }
        }
        avg = (double) sum/count;


        System.out.println("sum : "+sum);
        System.out.println("avg : "+avg);
    }//end of main

   
    
}//end of class

