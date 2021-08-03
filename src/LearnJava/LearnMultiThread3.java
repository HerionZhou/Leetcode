package LearnJava;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class LearnMultiThread3 {
    static class MyCallable implements Callable<Integer> {
        private int i = 0;
        @Override
        public Integer call() throws Exception {
            int sum = 0;
            for (i = 0; i < 10; i++){
                System.out.println(Thread.currentThread().getName() + " " + i);
                sum += i;
            }
            return sum;
        }
    }

    public static void main(String[] args) {
        Callable<Integer> myCallable = new MyCallable();
        FutureTask<Integer> futureTask = new FutureTask<>(myCallable);
        for (int i = 0; i < 10; i++){
            System.out.println(Thread.currentThread().getName() +" "+ i);
            if (i == 5){
                Thread thread1 = new Thread(futureTask);
                thread1.start();
            }
        }
        System.out.println("=============");
        try {
            int sum = futureTask.get();
            System.out.println("sum = " + sum);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }

}
