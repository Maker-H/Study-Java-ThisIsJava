package sec05_tree.exam04_comparator;

import java.util.TreeSet;

public class ComparatorExample {
    public static void main(String[] args) {
        TreeSet<Fruit> treeset = new TreeSet<Fruit>(new FruitComparator());

        treeset.add(new Fruit("grape", 3000));
        treeset.add(new Fruit("strawberry", 10000));
        treeset.add(new Fruit("kingsberry", 40000));

        for(Fruit fruit : treeset) {
            System.out.println(fruit.name+" "+ fruit.price);
        }
    }
}
