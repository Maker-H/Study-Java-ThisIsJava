package sec06_mapping.exam03_flatmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FlatMappingExample {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("this is java");
        list1.add("i am a best developer");
        list1.stream()
            .flatMap(data -> Arrays.stream(data.split(" ")))
            .forEach(word -> System.out.println(word));

        List<String> list2 = Arrays.asList("10, 20, 30", "40, 50");
        list2.stream()
            .flatMapToInt(data -> {
                String[] str = data.split(",");
                int [] intArr = new int[str.length];
                
                for(int i=0; i<str.length; i++) {
                    intArr[i] = Integer.parseInt(str[i].trim());
                }
                
                return Arrays.stream(intArr);
            })
            .forEach(num -> System.out.println(num));

    }    
}
