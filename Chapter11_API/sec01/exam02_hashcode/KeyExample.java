package sec01.exam02_hashcode;

import java.util.HashMap;

public class KeyExample {
    public static void main(String[] args) {
        
        HashMap<Key,String> hashmap = new HashMap<Key, String>();

        //use Key(1) to store Sam
        hashmap.put(new Key(1),"Sam");

        //Get value in Key(1), expect Sam!
        String value = hashmap.get(new Key(1));
        System.out.println(value);
    }
}
