package DesignPattern.Prototype;

public class PrototypePatternDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        MilkTea zhou = new MilkTea("zqy", false);
        MilkTea liu = zhou.clone();
        System.out.println(zhou == liu);
    }
}
