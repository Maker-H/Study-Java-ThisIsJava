package Question.exam08_set;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<Student> set = new HashSet<>();
        
        set.add(new Student(1, "heesom"));
        set.add(new Student(2, "java"));
        set.add(new Student(1, "jsp"));

        System.out.println("object number : "+set.size());
        for(Student s : set) {
            System.out.println(s.studentNum+ " : "+ s.name);
        }
    }
}
