package in.kgcoding.multithreading.executor.singlethread;

import in.kgcoding.multithreading.runnable.PrintTask;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestingSingleThreadExecutor {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        PrintTask printTask = new PrintTask('*');

        executorService.submit(printTask);
        executorService.submit(printTask);
        executorService.submit(printTask);

        executorService.shutdown();
    }
}
