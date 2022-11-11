package sec03_pipeline;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamPipeLineExample {
    public static void main(String[] args) {
        List<Student> list = Arrays.asList(
            new Student("heesom" , 28),
            new Student("iscool", 33),
            new Student("haha java", 50)
        );

        Stream<Student> studentStrema = list.stream();
        IntStream scoreStream = studentStrema.mapToInt(student -> student.getScore());
        double avg1 = scoreStream.average().getAsDouble();

        double avg2 = list.stream()
            .mapToInt(student -> student.getScore())
            .average()
            .getAsDouble();
        System.out.println("avg : " + avg1);
        System.out.println("avg : " + avg2);
    }
}
