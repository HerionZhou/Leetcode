package DesignPattern.Decorator.Increase;

public class IncreaseDecoratorPatternDemo {
    public static void main(String[] args) {
        IHouse house = new House();
        house.live();
        IStickyHookHouse stickyHookHouse = new StickyHookDecorator(house);
        stickyHookHouse.live();
        stickyHookHouse.hangThings();
    }
}
