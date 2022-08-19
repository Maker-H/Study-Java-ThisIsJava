package sec06.exam02_default_method_extends;

public interface ChildInterface3 extends ParentInterface{
    @Override //override default method to abstract
    public void method2();

    //new abstract method
    public void method3();
    
}
