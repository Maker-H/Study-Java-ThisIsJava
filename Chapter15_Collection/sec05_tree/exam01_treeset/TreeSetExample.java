package sec05_tree.exam01_treeset;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<Integer> scores = new TreeSet<>();

        scores.add(87);
        scores.add(98);
        scores.add(75);
        scores.add(95);
        scores.add(80);

        for(Integer s : scores) {
            System.out.println(s+" ");
        }
        System.out.println();
        
        System.out.println("lowest grade : "+scores.first());
        System.out.println("highses grade : " + scores.last());
        System.out.println("beneath 95 :"+scores.lower(95));
        System.out.println("higher than 87 :"+scores.higher(87));
        System.out.println("95 or 95 beneath : "+scores.floor(95));
        System.out.println("87 or higher than 87 : "+ scores.ceiling(87));
        System.out.println();

        NavigableSet<Integer> descendingScores = scores.descendingSet();
        for(Integer s : descendingScores){
            System.out.print(s+" ");
        }
        System.out.println();
        
        NavigableSet<Integer> rangeSet = scores.tailSet(80, true); //80 is tail so this means higher than 80
        for(Integer s : rangeSet) {
            System.out.print(s+" ");
        }
        System.out.println();
        
        rangeSet = scores.subSet(80, true, 90, false);
        for(Integer s : rangeSet) {
            System.out.print(s+" ");
        }
        System.out.println();




        

        
    }
}
