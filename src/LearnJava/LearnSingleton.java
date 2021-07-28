package LearnJava;


public class LearnSingleton {
    //双重校验锁DCL
    public static class Singleton{
        private volatile static Singleton instance;

        private Singleton() {};

        public static Singleton getInstance(){
            if (instance == null){
                synchronized (Singleton.class){
                    if (instance == null){
                        instance = new Singleton();
                    }
                }
            }
            return instance;
        }

    }

    public static class SynchronizedDemo {
        public void method() {
            synchronized (this) {
                System.out.println("synchronized 代码块");
            }
        }
    }

    public static void main(String[] args) {
        Singleton singleton;
        SynchronizedDemo synchronizedDemo = new SynchronizedDemo();
        synchronizedDemo.method();
    }
}
