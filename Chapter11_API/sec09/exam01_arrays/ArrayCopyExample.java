package sec09.exam01_arrays;

import java.util.Arrays;

public class ArrayCopyExample {
    public static void main(String[] args) {
        char[] arr1 = {'j', 'a','v','a'};

        //way 1
        char[] arr2 = Arrays.copyOf(arr1,arr1.length); //copy whole array
        System.out.println(Arrays.toString(arr2));
        
        //way 2
        char[] arr3 = Arrays.copyOfRange(arr1,1,3); //range of index 1~2 only includes  a and v
        System.out.println(Arrays.toString(arr3));
        
        //way 3
        char[] arr4 = new char[arr1.length];
        System.arraycopy(arr1, 0, arr4, 0, arr1.length);
        System.out.println(Arrays.toString(arr4));
        for(int i=0; i<arr4.length; i++) {
            System.out.println("arr4["+i+"]="+arr4[i]);;
        }


    }
}
