package Question.exam03;

public class Container<K, T> {
    private T value;
    private K key;

    public void set(K key, T value){
        this.value = value;
        this.key = key;
    }

    public K getkey() {
        return key;
    }

    public T getValue() {
        return value;
    }

}
