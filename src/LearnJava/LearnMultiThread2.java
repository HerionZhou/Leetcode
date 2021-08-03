package LearnJava;

public class LearnMultiThread2 {
    static class MyRunnable implements Runnable{

        private int i = 0;

        @Override
        public void run() {
            for (i = 0; i < 10; i++){
                System.out.println(Thread.currentThread().getName() + " " + i);
            }
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++){
            System.out.println(Thread.currentThread().getName() + " " + i);
            if (i == 5){
                Runnable myRunnable = new MyRunnable();
                Thread thread1 = new Thread(myRunnable);
                Thread thread2 = new Thread(myRunnable);
                thread1.start();
                thread2.start();
            }
        }
        System.out.println("============");
    }

}
