package sec12_collect.exam01_filtering;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectExample {
    public static void main(String[] args) {
        List<Student> total = new ArrayList<>();
        total.add(new Student("heesom", "female", 98));
        total.add(new Student("java", "female", 38));
        total.add(new Student("spring", "male", 19));
        total.add(new Student("graph", "male", 56));

        List<Student> male = total.stream()
            .filter(s -> s.getSex().equals("male"))
            .collect(Collectors.toList());
        
        male.stream()
            .forEach(s -> System.out.println(s.getName()));

        System.out.println();

        Map<String, Integer> map = total.stream()
            .collect(Collectors.toMap(
                s -> s.getName(),
                s -> s.getScore()
                )
            );

        System.out.println(map);


    }
}
