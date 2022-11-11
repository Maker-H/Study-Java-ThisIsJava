package Question.exam02_average;

import java.util.Arrays;
import java.util.List;

public class Example {
    public static void main(String[] args) {
        List<Member> member = Arrays.asList(
            new Member("heesom", 30),
            new Member("java", 40),
            new Member("spring", 26)
        );

        double avg = member.stream()
            .mapToInt(m -> m.getAge())
            .average()
            .getAsDouble();
        System.out.println("avg : " + avg);
    }    
}
