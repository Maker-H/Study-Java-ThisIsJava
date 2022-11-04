package sec02_noparam.exam01;

public class LambdaExample {
    public static void main(String[] args) {
        Person person = new Person();

        person.action(() -> {
            System.out.println("Going to work");
            System.out.println("Programming");
        });

        person.action(() -> System.out.println("Going home"));
    }
}
