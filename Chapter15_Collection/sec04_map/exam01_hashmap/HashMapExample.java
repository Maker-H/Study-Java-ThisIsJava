package sec04_map.exam01_hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import javax.print.attribute.HashPrintJobAttributeSet;

public class HashMapExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        
        map.put("apple", 100);
        map.put("samsumg", 85);
        map.put("xiaomi", 50);
        map.put("nokia", 10);
        System.out.println("total Entry number : "+map.size());
        System.out.println();
        
        String key = "apple";
        int value = map.get(key);
        System.out.println("appple : "+value);
        System.out.println();

        Set<String> keyset = map.keySet();
        Iterator<String> keyIterator = keyset.iterator();
        while(keyIterator.hasNext()) {
            String s = keyIterator.next();
            Integer i = map.get(s);
            System.out.println(s+" : "+i);
        }
        System.out.println();

        Set<Entry<String, Integer>> entrySet = map.entrySet();
        Iterator<Entry<String, Integer>> entryIterator = entrySet.iterator();
        while(entryIterator.hasNext()) {
            Entry<String, Integer> entry = entryIterator.next();
            String k = entry.getKey();
            Integer v = entry.getValue();
            System.out.println(k+" : "+v);
        }


        map.remove("nokia");
        System.out.println("Total entry number : "+map.size());

        


    }
}
