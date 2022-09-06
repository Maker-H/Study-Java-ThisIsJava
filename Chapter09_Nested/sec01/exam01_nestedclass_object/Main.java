package sec01.exam01_nestedclass_object;

public class Main {
    
    public static void main(String[] args) {
        A a = new A();
        
        
       /* A.B b = new A.B(); can't do it this way!!!!!!*/
        A.B b = a.new B();

        b.field1 = 3;
        b.method1();
    
        //----------------------------------------

        A.C c = new A.C();
        c.field1 = 3;
        c.method2();

        A.C.field2 = 4;


        //-----------------------------------------
        a.method();
    
    
    
    }
}
