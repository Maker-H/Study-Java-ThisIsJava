package Question.exam01_filter;

import java.util.Arrays;
import java.util.List;

public class Example {
    public static void main(String[] args) {
        List<String> str = Arrays.asList(
            "This is a java book",
            "Lamda Expressions",
            "Java supports lambda expressions"
        );
        str.stream()
            .filter(a -> a.toLowerCase().contains("java"))
            .forEach(s -> System.out.println(s));
    }
    
}
