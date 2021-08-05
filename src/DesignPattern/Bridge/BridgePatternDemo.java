package DesignPattern.Bridge;

public class BridgePatternDemo {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setColor(new Red());
        rectangle.draw();
    }
}
