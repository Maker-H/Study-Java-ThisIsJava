package sec05_filtering;

import java.util.ArrayList;
import java.util.List;

public class FilteringExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("이희솜"); list.add("김희솜");
        list.add("박희솜"); list.add("최희솜");
        list.add("박희솜"); list.add("최희솜");
        list.add("이희솜"); list.add("이희솜");

        list.stream()
            .distinct()
            .forEach(n -> System.out.println(n));
        System.out.println();


        list.stream()
            .filter(n->n.startsWith("이"))
            .forEach(n->System.out.println(n));
        System.out.println();

        
        list.stream()
            .distinct()
            .filter(n -> n.startsWith("박"))
            .forEach(n -> System.out.println(n));

    }
    
}
