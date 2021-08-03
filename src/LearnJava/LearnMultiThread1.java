package LearnJava;

public class LearnMultiThread1 {
    static class MyThread extends Thread {
        private int i;

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
                MyThread myThread1 = new MyThread();
                MyThread myThread2 = new MyThread();
                myThread1.start();
                myThread2.start();
            }
        }

    }

}
