package sec01.exam01_nestedclass_object;

public class A {
    //Constructor
    A() {
        System.out.println("Object A is created");

        //use class b in class a
        B b = new B();
        b.method1();
    }






    //instance member class
    class B{
        //Field
        int field1;
        // static int field2; //can't declare static

        //Constructor
        B(){
            System.out.println("Object B is created");
        }
        
        //method
        void method1(){}
    }







    //static member class
    static class C{
        //Field (instance O, static O)
        int field1;
        static int field2;

        //Constructor
        C(){
            System.out.println("Object C is created");
        }

        //method(intstance O, static O)
        void method2(){}
        static void method3(){}
        
    }





    //class A's method
    void method(){
        class D{
            //Field
            int field1;
            D(){
                System.out.println("Object D is created");
            }

            //method
            void method1(){}
        }
        D d = new D();
        d.field1 = 3;
        d.method1();
    }
}
