package DesignPattern.Visitor;

public class Customer implements IVisitor {
    @Override
    public void chooseLobster(String lobster) {
        System.out.println("Customer gets a " + lobster);
    }

    @Override
    public void chooseWatermelon(String watermelon) {
        System.out.println("Customer gets a " + watermelon);
    }

    @Override
    public void chooseSteak(String steak) {
        System.out.println("Customer don't like " + steak);
    }

    @Override
    public void chooseBanana(String banana) {
        System.out.println("Customer don't like " + banana);
    }
}
