package Question.exam04;

public class OtherPair<K,V> {
    private K key;
    private V value;

    public OtherPair(K k, V v){
        this.key = k;
        this.value= v;
    }

    public K getKey(){return key;}
    public V getValue(){return value;}
}
