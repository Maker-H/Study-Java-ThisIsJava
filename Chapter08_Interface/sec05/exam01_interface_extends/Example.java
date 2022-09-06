package sec05.exam01_interface_extends;

public class Example {
    public static void main(String[] args) {
        ImplementationC imp = new ImplementationC();

        InterfaceA ia = imp; //allocate implement object 'imp' to imterfacea, this means imp has promoted to interfacea
        ia.methodA(); //ia can only run methoda cause the type of imp is interfacea
        System.out.println("----------");
        
        
        InterfaceB ib = imp;
        ib.methodB();
        //ib.methodC();
        System.out.println("----------");

        
        InterfaceC ic = imp;
        ic.methodA();
        ic.methodB();
        ic.methodC();
    }
}
