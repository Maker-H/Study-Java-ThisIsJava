package sec02.exam01_member_class_access;

public class A{
    
    class B{} //instance member
    static class C{} //static memeber


    //instance field
    B field1 = new B(); 
    C field2 = new C();
    
    //instance method
    void method(){
        B var1 = new B(); 
        C var2 = new C();
    }
    
    //static field
    //static B field3 = new B();
    static C field4 = new C();
    
    //static method
    static void method1(){
        //B var1 = new B(); 
        C var3 = new C();
    }
    

}