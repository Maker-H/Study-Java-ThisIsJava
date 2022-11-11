package Question.exam03_collect;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example {
    public static void main(String[] args) {
        List<Member> member = Arrays.asList(
            new Member("heesom", "programmer"),
            new Member("java", "doctor"),
            new Member("spring", "programmer")
        );

        List<Member> programmers = member.stream()
        .filter(s -> s.getjob().equals("programmer"))
        .collect(Collectors.toList());

        programmers
            .stream()
            .forEach(p -> System.out.println(p.getName()));

        
    }
    
}
