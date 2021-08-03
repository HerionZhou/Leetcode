package LearnJava;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class LearnMultiThread4 {
    private static int POOL_NUM = 10;

    static class MyRunnable implements Runnable{

        @Override
        public void run() {
            System.out.println("通过线程池方式创建的线程：" + Thread.currentThread().getName() + " ");
        }
    }

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        for (int i = 0; i < POOL_NUM; i++){
            MyRunnable thread = new MyRunnable();
            executorService.execute(thread);
        }
        executorService.shutdown();
    }

}
