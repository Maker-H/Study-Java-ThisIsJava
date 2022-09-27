package sec02.exam01_objects;

import java.util.Objects;
import java.util.Arrays;
public class EqualsAndDeepEqualsExample {
    public static void main(String[] args) {
        Integer a = 1000;
        Integer b = 1000;
        System.out.println(Objects.equals(a,b));
        System.out.println(Objects.equals(a,null));
        System.out.println(Objects.equals(null,b));
        System.out.println(Objects.equals(null,null)); //caution
        System.out.println(Objects.deepEquals(a,b)+"\n"); //deepEquals is an array

        Integer[] arr1 = {1,2};
        Integer[] arr2 = {1,2};
        System.out.println(Objects.equals(arr1, arr2)); //false cause when compare array with equals it compares address not value
        System.out.println(Objects.deepEquals(arr1, arr2));
        System.out.println(Arrays.deepEquals(arr1, arr2));
        System.out.println(Objects.deepEquals(null, arr2));
        System.out.println(Objects.deepEquals(arr1, null));
        System.out.println(Objects.deepEquals(null, null)); //caution!
        
    }
}
