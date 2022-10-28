package sec09_threadpool.exam02_runnable;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableSubmitExample {
    public static void main(String[] args) {
        //Create ExecutorService 
        ExecutorService executorService = Executors.newFixedThreadPool(5);

        //Make calculation method and put it in que 
        for(int i=0; i<=100; i++){
            final int idx = i;
            Future<Integer> future = executorService.submit(new Callable<Integer>() {

                @Override
                public Integer call() throws Exception {
                    int sum = 0;
                    for(int i=0; i<=idx; i++) {
                        sum+=i;
                    }
                    Thread thread = Thread.currentThread();
                    System.out.println(thread.getName()+ " / calculate : "+idx);
                    return sum;
                }
                
            });

            try{
                int result = future.get();
                System.out.println("\t return value : "+ result);
            }catch (Exception e) {
                e.printStackTrace();
            }
        }

        executorService.shutdown();

    }
}
