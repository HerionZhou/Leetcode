package DesignPattern.Decorator.Enhance;

public class RingDecorator implements IBeauty {
    private final IBeauty person;

    public RingDecorator(IBeauty person) {
        this.person = person;
    }

    @Override
    public int getBeautyValue() {
        return person.getBeautyValue() + 20;
    }
}
