package sec04_map.exam02_hashtable;

import java.util.Hashtable;
import java.util.Map;

public class HashTableExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new Hashtable<>();

        Thread threadA = new Thread(){
            public void run() {
                for(int i=0;i<=1000;i++){
                    map.put(String.valueOf(i), i);
                }
            };
        };

        Thread threadB = new Thread(){
            public void run() {
                for(int i=1000;i<=2000;i++){
                    map.put(String.valueOf(i), i);
                }
            };
        };
        
        threadA.start();
        threadB.start();

        try {
            threadA.join();
            threadB.join();
        } catch (Exception e) {
            // TODO: handle exception
        }

        int size = map.size();
        System.out.println("total entry number : "+size);
    }
}
