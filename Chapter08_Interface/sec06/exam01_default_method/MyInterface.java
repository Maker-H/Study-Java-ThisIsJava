package sec06.exam01_default_method;

public interface MyInterface {

    //abstrac method
    public void method1();

    //modify interface
    default public void method2(){
        System.out.println("Myinterface - method");
    }
    
}
