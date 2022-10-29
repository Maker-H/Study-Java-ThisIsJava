package sec03_set.exam01_hashset;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();

        set.add("JAVA");
        set.add("JDBC");
        set.add("JSP");
        set.add("JAVA"); //doesn't stored in hashset
        set.add("Spring");

        int size = set.size();
        System.out.println("total object number : "+size);
    }
}
