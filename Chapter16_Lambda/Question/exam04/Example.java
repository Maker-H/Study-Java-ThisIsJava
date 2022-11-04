package Question.exam04;

public class Example {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            System.out.println("working thread is working");
            System.out.println("working thread is working");
            System.out.println("working thread is working");
            }
        );
        thread.start();
    }    
}
