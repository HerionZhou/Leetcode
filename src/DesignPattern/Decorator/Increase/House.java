package DesignPattern.Decorator.Increase;

public class House implements IHouse {

    @Override
    public void live() {
        System.out.println("原有功能：居住");
    }
}
