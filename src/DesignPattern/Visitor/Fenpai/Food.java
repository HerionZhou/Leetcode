package DesignPattern.Visitor.Fenpai;

public abstract class Food {
    public abstract String name();
    public abstract void accept(IVisitor visitor);
}
