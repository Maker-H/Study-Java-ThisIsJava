package sec09_matching;

import java.util.Arrays;

public class MatchingExample {
    public static void main(String[] args) {
        int[] intArr = {2, 4, 6};

        boolean result = Arrays.stream(intArr)
            .allMatch(a -> a%2==0);
        System.out.println("Does all number is even? : " + result);
        
        result = Arrays.stream(intArr)
            .anyMatch(a -> a%3==0);
        System.out.println("Does any number are multiple 3? : " + result);
        
        result = Arrays.stream(intArr)
            .noneMatch(a -> a%3==0);
        System.out.println("Does 3's multiple number exists? : " + result);
    }
}
