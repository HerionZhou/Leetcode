package DesignPattern.Facade;

public class FacadePatternDemo {
    public static void main(String[] args) {
        ShapeFacade shapeFacade = new ShapeFacade();
        shapeFacade.drawCircle();
        shapeFacade.drawRectangle();
        Shape circle = shapeFacade.getCircle();
        circle.draw();
    }

}
