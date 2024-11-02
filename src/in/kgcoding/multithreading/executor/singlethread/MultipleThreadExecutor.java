package in.kgcoding.multithreading.executor.singlethread;

import in.kgcoding.multithreading.runnable.PrintTask;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class MultipleThreadExecutor {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        for (int i = 0; i < 10; i++) {
            PrintTask printTask = new PrintTask((char) i);
            executorService.submit(printTask);

        }

        executorService.shutdown();
        System.out.println("88888888888888\n");
        if(!executorService.awaitTermination(10, TimeUnit.SECONDS)){
            System.out.println("7777777777777777 \n");
            executorService.shutdownNow();
        }
    }
}
