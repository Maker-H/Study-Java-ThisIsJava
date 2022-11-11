package sec07_sort.exam01_comparable;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortingExample {
    public static void main(String[] args) {
        List<Student> student = new ArrayList<>();
        student.add(new Student("heesom", 100));
        student.add(new Student("css", 10));
        student.add(new Student("html", 40));

        student.stream()
            .sorted()
            .forEach(s -> System.out.println(s.getName() + " : " + s.getScore()));
            System.out.println();
            
            student.stream()
            .sorted(Comparator.reverseOrder())
            .forEach(s -> System.out.println(s.getName() + " : " + s.getScore()));
    }
}
