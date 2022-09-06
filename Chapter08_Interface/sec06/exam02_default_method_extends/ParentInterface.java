package sec06.exam02_default_method_extends;

public interface ParentInterface {
    //abstract
    public void method1();

    //default
    public default void method2() {
        System.out.println("parent - method2");
    }
}
