package sec04.exam01_anonymous_extends;

public class AnonymousExample {
    public static void main(String[] args) {
        Anonymous anon = new Anonymous();
        
        //use anonymous field
        anon.field.wake();

        //use local variable of object method
        anon.method1();

        //use parameters of anonymous obeject
        anon.method2( 
            new Person() {
                void study() {
                    System.out.println("study");
                }

                @Override
                void wake() {
                    System.out.println("wake up at 8 ");
                    study();
                }
            }
        );
    }
}
