package sec11.exam01_math;

import java.util.Arrays;
import java.util.Random;
public class RandomExample {
    public static void main(String[] args) {
        int[] selectNum = new int[6];
        Random random = new Random(3);
        System.out.print("Selected Num : ");
        for(int i=0;i<6;i++) {
            selectNum[i] = random.nextInt(45)+1; //get num 1~45 and put it ina array
            System.out.print(selectNum[i]+ " ");
        }
        System.out.println();

        //winner num
        int[] winningNum = new int[6];
        random = new Random(6);
        System.out.print("Winning Num : ");
        for(int i=0;i<6;i++) {
            winningNum[i] = random.nextInt(45)+1;
            System.out.print(winningNum[i] + " ");
        }
        System.out.println();

        //win or not
        Arrays.sort(selectNum);
        Arrays.sort(winningNum);
        boolean result = Arrays.equals(selectNum, winningNum);
        System.out.print("Win or not : ");
        if(result) {
            System.out.println("won lotteray");
        } else {
            System.out.println("loose lotteray");
        }
        

    }
}
