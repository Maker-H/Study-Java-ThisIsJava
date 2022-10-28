package sec02_list.exam03_linkedlist;

import java.util.ArrayList;
import java.util.List;

public class LinkedListExample {
    public static void main(String[] args) {
        List<String> l1 = new ArrayList<>();
        List<String> l2 = new ArrayList<>();

        long startTime;
        long endTime;

        startTime = System.nanoTime();
        for(int i=0;i<10000;i++) {
            l1.add(0,String.valueOf(i));
        }
        endTime = System.nanoTime();
        System.out.printf("%-17s %d ns \n", "Time taken : ", endTime-startTime);
        
    }
}
