package sec06_mapping.exam01;

import java.util.ArrayList;
import java.util.List;

public class MapExample {
    public static void main(String[] args) {
        List<Student> student = new ArrayList<>();
        student.add(new Student("heesom", 49));
        student.add(new Student("heesom", 100));
        student.add(new Student("heesom", 90));

        student.stream()
            .mapToInt(n -> n.getScore())
            .forEach(score -> System.out.println(score));
    }
}
