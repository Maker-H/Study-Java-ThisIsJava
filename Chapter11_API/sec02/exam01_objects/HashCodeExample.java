package sec02.exam01_objects;

import java.util.Objects;

public class HashCodeExample {
    public static void main(String[] args) {
        Student s1 = new Student(1, "Sam");
        Student s2 = new Student(1, "Sam");
        System.out.println(s1.hashCode());
        System.out.println(Objects.hashCode(s2));

    }//end of main

    //Nested class
    public static class Student {
        int sno; //studentNum
        String name;
        Student(int sno, String name) {
            this.sno = sno;
            this.name = name;
        }
    

    //Method
    @Override
    public int hashCode() {
        return Objects.hash(sno, name);
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Student) {
            Student s = (Student) obj;
            if(s.sno == this.sno) {
                if(s.name.equals(this.name)) {
                    return true;
                }
            }
        }
        return false; 
    }
}
}
