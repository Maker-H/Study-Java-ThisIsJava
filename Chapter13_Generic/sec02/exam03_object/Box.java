package sec02.exam03_object;

public class Box <T>{
    public T content;

    public boolean compare(Box<T> other){
        boolean result = content.equals(other.content);
        return result;
    }
}
