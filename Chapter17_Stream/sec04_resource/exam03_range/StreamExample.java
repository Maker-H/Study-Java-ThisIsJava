package sec04_resource.exam03_range;

import java.util.stream.IntStream;

public class StreamExample {
    public static int sum;
    public static void main(String[] args) {
        IntStream intStream = IntStream.rangeClosed(1, 100);
        intStream.forEach(a -> sum+=a);
        System.out.println(sum);
    }
}
