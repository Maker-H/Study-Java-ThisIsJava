package Question.exam02_anonymous_implements;

public class AnonymousExample {
    public static void main(String[] args) {
        Anonymous anon = new Anonymous();
        anon.field.run();
        anon.method1();
        anon.method2( new Vehicle() {
                @Override
                public void run() {
                    System.out.println("Truck is running");
                }
            });
    }
}
