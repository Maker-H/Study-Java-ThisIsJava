public class Ch5_ArrayCreateByValueListExample {
    public static void main(String[] args) {
        int[] scores;
        scores = new int[] {83,90,87}; //generate array
        int sum1 = 0;    
        for(int i=0; i<3; i++) {
            sum1+=scores[i];
        }
        System.out.println("total : "+sum1);

        int sum2 = add( new int[]{83,90,88} ); //generate new array
        System.out.println("total : "+ sum2);
        System.out.println();
    }//end of main

    public static int add(int[] scores) {
        int sum = 0;
        for(int i=0; i<3; i++) {
            sum +=scores[i];
        }
        return sum;
    }//end of add
    
}//end of class
