package sec12_collect.exam02_grouping;

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

        Map<String, List<Student>> map = total.stream()
            .collect(
                Collectors.groupingBy(s -> s.getSex())
            );
        
        List<Student> female = map.get("female");
        female.stream().forEach(s -> System.out.println(s.getName()));
        System.out.println();

        List<Student> male = map.get("male");
        male.stream().forEach(s -> System.out.println(s.getName()));
    }
}
