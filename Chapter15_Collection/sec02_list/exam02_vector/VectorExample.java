package sec02_list.exam02_vector;

import java.util.List;
import java.util.Vector;

import sec02_list.exam01_arraylist.Board;

public class VectorExample {
    public static void main(String[] args) {
        List<Board> list = new Vector<>();

        Thread threadA = new Thread(){
            public void run() {
                for(int i=0; i<1000; i++){
                    list.add(new Board("subject"+i, "content"+i, "writer"+i));
                }
            }
        };

        Thread threadB = new Thread(){
            public void run() {
                for(int i=1001; i<2001; i++){
                    list.add(new Board("subject"+i, "content"+i, "writer"+i));
                }
            }
        };

        threadA.start();
        threadB.start();


        //main thread have to wait until work is done by threadA theadB
        try {
            threadA.join();
            threadB.join();
        } catch (Exception e) {
        }

        int size = list.size();
        System.out.println("total objects number : " + size);
        
        
    }
}
