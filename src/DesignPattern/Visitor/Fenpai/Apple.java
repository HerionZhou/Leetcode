package DesignPattern.Visitor.Fenpai;

public class Apple extends Food {
    @Override
    public String name() {
        return "Apple";
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.chooseFood(this);
    }
}
