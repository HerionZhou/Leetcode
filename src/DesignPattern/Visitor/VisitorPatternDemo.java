package DesignPattern.Visitor;

public class VisitorPatternDemo {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant();
        IVisitor visitor = new Customer();
        restaurant.welcome(visitor);
    }
}
