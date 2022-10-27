package sec09.exam01_arrays;

import java.util.Arrays;
public class SortExample {
    public static void main(String[] args) {
        /*=======int========*/
        int[] scores = { 99,  97, 98};
        Arrays.sort(scores);
        System.out.println(Arrays.toString(scores));
        for(int i=0;i<scores.length;i++){
            System.out.println("scores["+i+"]="+scores[i]);
        }
        System.out.println();
        
        /*=======string========*/
        String[] names = {"Sam","Marry","Google","Mark"};
        Arrays.sort(names);
        for(int i=0;i<names.length;i++){
            System.out.println(names[i]);
        }
        System.out.println();
        
        /*=======Member(Made my me class)========*/
        Member m1 = new Member("Sam");
        Member m2 = new Member("GRay");
        Member m3 = new Member("NARA");
        Member[] members = {m1,m2,m3};
        Arrays.sort(members);
        for(int i=0;i<members.length;i++){
            System.out.println(members[i].name);
        }

    }
}