package DesignPattern.Facade;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("绘制一个圆形");
    }
}
