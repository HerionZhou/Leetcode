package DesignPattern.Observer;

public class ObserverPatternDemo {
    public static void main(String[] args) {
        CriminalObservable zhangsan = new CriminalObservable();
        PoliceObserver police1 = new PoliceObserver();
        PoliceObserver police2 = new PoliceObserver();

        zhangsan.addObserver(police1);
        zhangsan.addObserver(police2);

        zhangsan.crime("杀人");
    }


}
