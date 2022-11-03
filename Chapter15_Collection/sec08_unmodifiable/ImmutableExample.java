package sec08_unmodifiable;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ImmutableExample {
    public static void main(String[] args) {
        List<String> immutableList1 = List.of("a", "b", "c");

        Set<String> immutableSet1 = Set.of("a", "b", "c");

        Map<Integer, String> immutableMap1 = Map.of(
            1, "a",
            2, "b",
            3, "c"
        );

        Set<String> set = new HashSet<>();
        set.add("a");
        set.add("b");
        set.add("c");
        Set<String> immutableSet2 = Set.copyOf(set);

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "a");
        map.put(2, "b");
        map.put(3, "c");
        Map<Integer, String> immutableMap3 = Map.copyOf(map);

        String[] arr = {"a", "b", "c"};
        List<String> immutablList4 = Arrays.asList(arr);



        
    }    
}
