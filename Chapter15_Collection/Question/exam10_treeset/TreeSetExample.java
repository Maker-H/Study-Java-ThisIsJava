package Question.exam10_treeset;

import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<Student> treeset = new TreeSet<Student>();
        treeset.add(new Student("blue", 96));
        treeset.add(new Student("hong", 86));
        treeset.add(new Student("while", 92));

        Student student = treeset.last();
        System.out.println("best score : " + student.score);
        System.out.println("id that get best score : " + student.id);


        
    }
}
