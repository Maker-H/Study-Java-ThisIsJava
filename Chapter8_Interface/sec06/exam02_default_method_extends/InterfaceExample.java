package sec06.exam02_default_method_extends;

public class InterfaceExample {
    public static void main(String[] args) {
        ChildInterface1 ch1 = new ChildInterface1() {
            //override parent-abstract method1, child-default method2, new abstract method3
            @Override
            public void method1() {
                System.out.println("parent-abstract method1");
            }

            @Override
            public void method3() {
                System.out.println("child-abstract method3");
            }
        };
        ch1.method1(); //overrided
        ch1.method2();
        ch1.method3(); //overrided
        System.out.println("----------------");
        
        
        
        ChildInterface2 ch2 = new ChildInterface2() {
            
            @Override
            public void method1() {
                System.out.println("parent-abstract method1");
            }
            
            @Override
            public void method3() {
                System.out.println("child-abstract method3");
            }
        };
        ch2.method1();
        ch2.method2();
        ch2.method3();
        System.out.println("----------------");
        
        
        ChildInterface3 ch3 = new ChildInterface3() {
            
            @Override
            public void method1() {
                System.out.println("parent-abstract method1");
            }

            @Override //it was default method but overrided at child interface to abstract. so have to override.
            public void method2() {
                System.out.println("Once default but overrided so have to override again");
            }

            @Override
            public void method3() {
                System.out.println("child-abstract method");
            }
            
        };

        ch3.method1();
        ch3.method2();
        ch3.method3();
    }
}
