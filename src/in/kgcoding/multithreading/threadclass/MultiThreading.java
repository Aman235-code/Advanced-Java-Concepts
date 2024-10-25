package in.kgcoding.multithreading.threadclass;

public class MultiThreading {
    public static void main(String[] args) {
        long starttime = System.currentTimeMillis();

        for (int i = 1; i <= 1000 ; i++) {
            System.out.printf("%d* ",i);
        }
        System.out.println("\n* Task Completed");

        for (int i = 1; i <= 1000 ; i++) {
            System.out.printf("%d*$ ",i);
        }
        System.out.println("\n*$ Task Completed");

        for (int i = 1; i <= 1000 ; i++) {
            System.out.printf("%d* ",i);
        }
        System.out.println("\n*# Task Completed");

        long endTime = System.currentTimeMillis();
        System.out.printf("Time taken %d",(endTime-starttime));
    }
}
