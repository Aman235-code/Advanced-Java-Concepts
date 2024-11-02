package in.kgcoding.multithreading.features;

import java.util.concurrent.*;

public class TestingFeatures {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        FetchName fetchName1 = new FetchName("Aman");
        FetchName fetchName2 = new FetchName("Amanb");
        FetchName fetchName3 = new FetchName("Amanc");
        FetchName fetchName4 = new FetchName("Amand");
        Future<String> name1 =  executorService.submit(fetchName1);
        Future<String> name2 =  executorService.submit(fetchName2);
        Future<String> name3 =  executorService.submit(fetchName3);
        Future<String> name4 =  executorService.submit(fetchName4);
        System.out.printf("Full Name is: %s\n",name1.get());
        System.out.printf("Full Name is: %s\n",name2.get());
        System.out.printf("Full Name is: %s\n",name3.get());
        System.out.printf("Full Name is: %s\n",name4.get());

        executorService.shutdown();
    }
}
