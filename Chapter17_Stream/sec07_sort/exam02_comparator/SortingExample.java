package sec07_sort.exam02_comparator;

import java.util.ArrayList;
import java.util.List;

public class SortingExample {
    public static void main(String[] args) {
        List<Student> student = new ArrayList<>();
        student.add(new Student("heesom", 90));
        student.add(new Student("java", 90));
        student.add(new Student("spring", 40));

        student.stream()
            .sorted((s1, s2) -> Integer.compare(s1.getScore(), s2.getScore()))
            .forEach(s -> System.out.println(s.getName() + " : " + s.getScore()));
        System.out.println();

        student.stream()
            .sorted((s1, s2) -> Integer.compare(s2.getScore(), s1.getScore()))
            .forEach(s -> System.out.println(s.getName() + " : " + s.getScore()));

        
    }
}
