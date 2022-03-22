package DesignPattern.ThreadSafeSingletonExample;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadSafeSingleton {
    public static void main(String[] args) {
        ExecutorService executorService = null;
        MyThread T = new MyThread();

        try {
            executorService = Executors.newFixedThreadPool(5);
            executorService.execute(T);
            executorService.execute(T);
            executorService.execute(T);
            executorService.execute(T);
            executorService.execute(T);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (executorService != null) {
                executorService.shutdown();
            }
        }


    }

}
