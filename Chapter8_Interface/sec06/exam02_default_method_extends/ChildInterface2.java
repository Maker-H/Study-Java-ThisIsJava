package sec06.exam02_default_method_extends;

public interface ChildInterface2 extends ParentInterface{
    //gets abstract method1 and default method2
    
    
    @Override
    public default void method2() {
        System.out.println("interface_child2 - method2");
    }

    //new abstract
    public void method3();


    

    
}
