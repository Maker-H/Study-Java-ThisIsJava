package sec02.exam01_objects;

import java.util.Objects;

public class NullExample {
    public static void main(String[] args) {
        //Field
        String str1 = "Sam";
        String str2 = null;

        //if str1 is not null return str1
        System.out.println(Objects.requireNonNull(str1));
        System.out.println(Objects.isNull(str1)); //not null->false
        System.out.println(Objects.nonNull(str1)); //not null->true
        

        System.out.println();


        try {
            String name = Objects.requireNonNull(str2);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try { //if str2 is null return 'No Name'
            String name = Objects.requireNonNull(str2, "No Name");
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            String name = Objects.requireNonNull(str2, ()->"I Have No Name!");
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
