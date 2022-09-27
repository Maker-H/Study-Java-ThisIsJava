package sec09.exam01_arrays;

import java.util.Arrays;
public class Member implements Comparable<Member> {
    //Field
    String name;

    //Constructor
    Member(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Member o) {
        return name.compareTo(o.name);
    }


    
}
