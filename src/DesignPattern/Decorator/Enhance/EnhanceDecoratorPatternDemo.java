package DesignPattern.Decorator.Enhance;

public class EnhanceDecoratorPatternDemo {
    public static void main(String[] args) {
        IBeauty person = new Person();
        System.out.println(person.getBeautyValue());
        IBeauty ringDecorator = new RingDecorator(person);
        System.out.println(ringDecorator.getBeautyValue());
    }
}
