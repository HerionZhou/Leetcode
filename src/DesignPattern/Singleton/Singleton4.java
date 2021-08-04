package DesignPattern.Singleton;


public class Singleton4 {
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

        public void message(){
            System.out.println("双重校验锁单例");
        }

    }

    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        singleton.message();
    }
}
