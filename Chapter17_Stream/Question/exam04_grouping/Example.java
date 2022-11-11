package Question.exam04_grouping;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Example {
    public static void main(String[] args) {
        List<Member> member = Arrays.asList(
            new Member("heesom", "programmer"),
            new Member("java", "doctor"),
            new Member("spring", "programmer")
        );

        Map<String, List<Member>>  grouping = member.stream()
            .collect(Collectors.groupingBy(m -> m.getjob()));
        
        System.out.println("[programmer]");

        List<Member> programmer = grouping.get("programmer");
        System.out.println(programmer);

        Map<String, String> map = grouping
            .get("programmer")
            .stream()
            .collect(
                Collectors.toMap(
                    s -> s.getName(),
                    s -> s.getjob()
                )
            );
        System.out.println(map);
        

    }
}
