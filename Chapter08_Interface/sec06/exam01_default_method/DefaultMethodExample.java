package sec06.exam01_default_method;

public class DefaultMethodExample {
    public static void main (String[] args) {
        MyInterface mi = new MyClassA();
        mi.method1(); 
        mi.method2(); //class before modification. print default

        mi = new MyClassB();
        mi.method1();
        mi.method2(); //class after modification. overrided.
    }
}
