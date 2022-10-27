package Question.exam03_hashmap;

import java.util.HashMap;

public class StudentExample {
    public static void main(String[] args) {
        //creat object that stores total score with student key
        HashMap<Student, String> hashMap = new HashMap<Student, String>();

        //store score 95 to student'1'
        hashMap.put(new Student("1"), "95");

        //get score by new student '1'
        String score = hashMap.get(new Student("1"));
        System.out.println("number 1 student's total score : "+score);


    }
}
