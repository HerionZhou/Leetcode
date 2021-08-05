package DesignPattern.Facade;

public class ShapeFacade {
    private Shape circle;
    private Shape rectangle;

    public Shape getCircle() {
        return circle;
    }

    public Shape getRectangle() {
        return rectangle;
    }

    public ShapeFacade(){
        this.circle = new Circle();
        this.rectangle = new Rectangle();
    }

    public void drawCircle(){
        circle.draw();
    }

    public void drawRectangle(){
        rectangle.draw();
    }
}
