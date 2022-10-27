package Question.exam04;

public class Util {


    public static <T extends Pair<K,V>, K, V> V getValue(T pairType, K key){
        if(key.equals(pairType.getKey())){
            return pairType.getValue();
        }
        return null;
    }

}
