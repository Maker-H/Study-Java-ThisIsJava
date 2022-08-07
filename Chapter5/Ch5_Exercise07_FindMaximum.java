public class Ch5_Exercise07_FindMaximum {
    public static void main(String[] args) {
        int max = 0;
        int[] array = {1,5,3,8,2};

        max = array[0]; 
        for(int i=1;i<array.length; i++) {
            if(max<=array[i]) {
                max = array[i];
            }
        }
        System.out.println("the largest number is "+ max);

    }//end of main

   
    
}//end of class

