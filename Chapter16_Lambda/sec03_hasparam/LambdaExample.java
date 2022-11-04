package sec03_hasparam;

public class LambdaExample {
    public static void main(String[] args) {
        Person person = new Person();

        person.action1((name, job) -> {
            System.out.println(name + "is ");
            System.out.println(job);
        });

        person.action1((name, job) -> System.out.println(name + "is not " + job));

        person.action2((word) -> {
            System.out.println("\"" + word + "\"");
        });
        person.action2((word) -> System.out.println("shouting " + word));
    }
}
