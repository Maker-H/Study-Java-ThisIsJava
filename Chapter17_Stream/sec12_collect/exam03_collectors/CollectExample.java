package sec12_collect.exam03_collectors;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CollectExample {
    public static void main(String[] args) {
        List<Student> total = new ArrayList<>();
        total.add(new Student("heesom", "female", 98));
        total.add(new Student("java", "female", 38));
        total.add(new Student("spring", "male", 19));
        total.add(new Student("graph", "male", 56));

        Map<String, Double> map = total.stream()
            .collect(
                Collectors.groupingBy(
                    Student :: getSex,
                    Collectors.averagingDouble(s -> s.getScore())
                )
            );

        System.out.println(map);
    }
}
