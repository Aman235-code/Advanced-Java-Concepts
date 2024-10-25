package in.kgcoding.multithreading.threadclass;

public class SecondTask extends Thread{
    @Override
    public void run() {
        for (int i = 1; i <= 1000 ; i++) {
            System.out.printf("%d*$ ",i);
        }
        System.out.printf("\n*$ Task Completed %s",Thread.currentThread().getName());
    }
}
