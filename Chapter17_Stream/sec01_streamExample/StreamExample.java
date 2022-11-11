package sec01_streamExample;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("홍");
        set.add("신");
        set.add("김");

        Stream<String> stream = set.stream();
        stream.forEach(name -> System.out.println(name));
    }
}
