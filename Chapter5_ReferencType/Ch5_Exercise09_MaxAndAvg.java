import java.util.Scanner;

public class Ch5_Exercise09_MaxAndAvg {
    public static void main(String[] args) {
        boolean run = true;
        int studentNum = 0;
        int[] scores = null;
        Scanner scanner = new Scanner(System.in);

        while(run) {
            System.out.println("------------------");
            System.out.println("1.The number of studens | 2.Enter score | 3.Scores list | 4.Analysis | 5.Exit");
            System.out.println("------------------");
            System.out.print("Enter >");
            
            int selectNo = scanner.nextInt();

            if(selectNo ==1) { //number of student
                System.out.print("Enter number of sudents : ");
                studentNum = scanner.nextInt();
                scores = new int[studentNum];
            }else if(selectNo==2) { //enter score
                for(int i=0; i<scores.length; i++) {
                    System.out.print("Scores["+i+"] : ");
                    scores[i] = scanner.nextInt();
                }
            }else if(selectNo==3) { //scores list
                for(int i=0; i<scores.length; i++) {
                    System.out.println("Scores : "+scores[i]);
                }
            }else if(selectNo==4) { //sum and avg
                int sum = 0;
                int max = 0;
                for(int i=0; i<scores.length; i++) {
                    sum+=scores[i];
                    if(max<=scores[i]) {
                        max = scores[i];
                    }
                }
                System.out.println("highest score : "+ max);
                System.out.println("average score : "+ (double) sum/scores.length);
            }else {
                run =false;
            }
            
            
        }//end of loop

    }//end of main

   
    
}//end of class

