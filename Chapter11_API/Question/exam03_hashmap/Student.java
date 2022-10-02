package Question.exam03_hashmap;

import java.util.Objects;

public class Student {
    //Field
    private String studentNum;

    //Constructor
    public Student(String studentNum){
        this.studentNum = studentNum;
    }

    //Method
    public String getStudentNum() {
        return studentNum;
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentNum);
    }

    @Override
    public boolean equals(Object obj) {
        
        if(obj instanceof Student) {
            Student student = (Student) obj;
            if(studentNum.equals(student.studentNum)){
                return true;
            }
        }
        return false;
    }
}