package sec04_resource.exam01_collections;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();
        for(int i=0; i<=5; i++) {
            Product product = new Product(i, "product"+i, "nice company", (int)(10000*Math.random()));
            list.add(product);
        }

        Stream<Product> stream = list.stream();
        stream.forEach(p -> System.out.println(p));
        
    }
}
