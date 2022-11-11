package sec11_reduce;

import java.util.Arrays;
import java.util.List;

public class ReductionExample {
    public static void main(String[] args) {
        List<Student> student = Arrays.asList(
            new Student("heesom", 100),
            new Student("java", 39),
            new Student("spring", 49)
        );

        int sum1 = student.stream()
            .mapToInt(Student :: getScore)
            .sum();
        System.out.println("sum1 : " + sum1);

        int sum2 = student.stream()
            .mapToInt(Student :: getScore)
            .reduce(0, (a,b) -> a+b);
        System.out.println("reduce sum : " + sum2);
    }    
}
