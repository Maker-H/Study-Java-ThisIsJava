package sec09_threadpool.exam01_create;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;;

public class ExecutorServiceExample {
    public static void main(String[] args) {
        ExecutorService executorservice = Executors.newFixedThreadPool(5);
        
    }
}
