package in.kgcoding.multithreading.threadclass;

public class TestMultiThreading {
    public static void main(String[] args) {
        long starttime = System.currentTimeMillis();
        FirstTask t1 = new FirstTask();
        SecondTask t2 = new SecondTask();
        ThirdTask t3 = new ThirdTask();

        System.out.println("\nStarting First Thread");
        t1.start();
        System.out.println("\nStarting Second Thread");
        t2.start();
        System.out.println("\nStarting Third Thread");
        t3.start();

        long endTime = System.currentTimeMillis();
        System.out.println();
        System.out.printf("\n %s Time taken %d",Thread.currentThread().getName(),(endTime-starttime));
    }
}
