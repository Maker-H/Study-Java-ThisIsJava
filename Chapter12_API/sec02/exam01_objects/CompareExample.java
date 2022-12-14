package sec02.exam01_objects;


import java.util.Comparator;
import java.util.Objects;
public class CompareExample {
    public static void main(String[] args) {
        Student s1 = new Student(1);
        Student s2 = new Student(2);
        Student s3 = new Student(3);

        //int result  = Objects.compare(s1,s2,c);
        int result = Objects.compare(s2, s1, new StudentComparator());
        System.out.println(result);
        
        result = Objects.compare(s1, s3, new StudentComparator());
        System.out.println(result);

    }
    
    //Nested Class
    static class Student {
        int sno; //student number
        
        //Constructor
        Student(int sno) {
            this.sno=sno;
        }
    }

    //New nested implemented class
    static class StudentComparator implements Comparator<Student> {

        @Override
        public int compare(Student a, Student b) {
           /*  if(a.sno<b.sno) return -1;
            else if(a.sno==b.sno) return 0;
            else return 1; */
            return Integer.compare(a.sno,b.sno);
        }
        
    }
}
