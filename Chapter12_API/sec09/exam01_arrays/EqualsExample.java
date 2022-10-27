package sec09.exam01_arrays;

import java.util.Arrays;

public class EqualsExample {
    public static void main(String[] args) {
        
    
        int [][]original = {
        {1,2},
        {3,4}
        };

        //shallow copy
        System.out.println("[shallow copy]");
        int[][] cloned1 = Arrays.copyOf(original, original.length);
        System.out.println("Compare [Original Array] address : " + original.equals(cloned1)); // except string, equals compares address of object
        System.out.println("Compare [Cloned Array] item values : "+ Arrays.equals(original, cloned1));
        System.out.println("Compare [Nested array] item vlaues : "+Arrays.deepEquals(original, cloned1));
        
        //deep copy
        System.out.println("\n[Deep copy]");
        int[][] cloned2 = Arrays.copyOf(original,original.length);
        cloned2[0] = Arrays.copyOf(original[0], original[0].length) ;
        cloned2[1] = Arrays.copyOf(original[1], original[1].length) ;
        System.out.println("Compare [Original Array] address : " + original.equals(cloned2)); // except string, equals compares address of object
        System.out.println("Compare [Cloned Array] item values : "+ Arrays.equals(original, cloned2));
        System.out.println("Compare [Nested array] item vlaues : "+Arrays.deepEquals(original, cloned2));

    
    }
}
