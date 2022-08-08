public class Ch5_AdvancedForExample {
    public static void main(String[] args) {
        int[] scores = {95,71,84,93,87};
        
        int sum = 0;
        for(int arrforSave:scores) {
            sum +=arrforSave;
        }
        System.out.println("The sum of the score : " + sum);

        double avg = (double) sum/scores.length;
        System.out.println("Avg of the score : " +avg);
    }//end of main

}//end of class

