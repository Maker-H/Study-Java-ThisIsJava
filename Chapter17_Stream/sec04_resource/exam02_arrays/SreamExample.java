package sec04_resource.exam02_arrays;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SreamExample {
    public static void main(String[] args) {
        String[] strArr = { "heesom", "is", "awsome"};
        Stream<String> strStream = Arrays.stream(strArr);
        strStream.forEach(item -> System.out.print(item +", "));
        System.out.println();

        int[] intArr = {1, 2, 3, 4, 5, 6};
        IntStream intStream = Arrays.stream(intArr);
        intStream.forEach(i -> System.out.print(i + ", "));
    }
}
