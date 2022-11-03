package sec05_tree.exam03_comparable;

import java.util.TreeSet;

public class ComparableExample {
    public static void main(String[] args) {
        TreeSet<Person> treeset = new TreeSet<Person>();
        treeset.add(new Person("apple", 12));
        treeset.add(new Person("samsumg", 34));
        treeset.add(new Person("Google", 0));
        for(Person person : treeset) {
            System.out.println(person.name+" : "+person.age);
        }

    }
}
