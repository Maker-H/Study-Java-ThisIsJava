package sec05.exam01_interface_extends;

public class ImplementationC implements InterfaceC{

    @Override
    public void methodC() {
        System.out.println("Run ImplementationC - MethodC");
        
    }

    //have to contain abstract method of parent interface
    @Override
    public void methodA() {
        System.out.println("Run ImplementationC - MethodA ");
        
    }

    @Override
    public void methodB() {
        System.out.println( "Run ImplementationC - MethodB ");
        
    }
    
}
