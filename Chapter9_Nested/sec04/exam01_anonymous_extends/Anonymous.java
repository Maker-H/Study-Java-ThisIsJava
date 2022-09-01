package sec04.exam01_anonymous_extends;

public class Anonymous {
    //anonymous child field 
    Person field = new Person() {
        void work() {
            System.out.println("Going to work");
        }

        @Override
        void wake(){
            System.out.println("Wake up at 6");
            work();
        }
    };

    void method1() {
        //local variable
        Person localVar = new Person() {
            void walk() {
                System.out.println("go for walk");
            }

            @Override
            void wake(){
                System.out.println("Wake up at 7");
                walk(); 
            }
        };


        //use localvar only wake method can be used, cause wake method is belong to personclass
        localVar.wake();
    }

    void method2(Person person) {
        person.wake();
    }
}
