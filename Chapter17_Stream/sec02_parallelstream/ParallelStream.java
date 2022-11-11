package sec02_parallelstream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ParallelStream {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("heesom");
        list.add("is");
        list.add("cool");
        list.add("and");
        list.add("awsome");
        list.add("!!");

        Stream<String> parallelStream = list.parallelStream();
        parallelStream.forEach(name -> {
            System.out.println(name + " : " + Thread.currentThread().getName());
        });
    }
}
