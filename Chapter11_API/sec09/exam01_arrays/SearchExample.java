package sec09.exam01_arrays;

import java.util.Arrays;

public class SearchExample {
    public static void main(String[] args) {
        //search default type 
        int[] scores = {97,99,98};
        Arrays.sort(scores);
        int index = Arrays.binarySearch(scores, 99);
        System.out.println("Find (99) index : " +index);
        
        //search String type
        String[] names = {"Sam","Google","Kakao"};
        Arrays.sort(names);
        index = Arrays.binarySearch(names,"Kakao");
        System.out.println("Find (Kakao) index : " +index);


        //search myType
        Member m1 = new Member("Apple");
        Member m3 = new Member("BMW");
        Member m2 = new Member("Cow");
        Member[] members = {m1,m2,m3};
        Arrays.sort(members);
        index = Arrays.binarySearch(members,m2);
        System.out.println("Fine (m2) index : "+index);
        

        
    }
}
