package Question.exam09_map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class MapExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("blue", 96);
        map.put("hong", 86);
        map.put("while", 92);

        String name = null;
        int maxScore = 0;
        int totalScore = 0;

        Set<Entry<String, Integer>> comparemap = map.entrySet();
        for(Entry<String, Integer> entry : comparemap) {
            if(entry.getValue()>maxScore) {
                name = entry.getKey();
                maxScore = entry.getValue();
            }
            totalScore+=entry.getValue();
        }        

        System.out.println("avg scord : " + totalScore/map.size());
        System.out.println("max score : " + maxScore);
        System.out.println("name that has max score : " + name);
    }
}
