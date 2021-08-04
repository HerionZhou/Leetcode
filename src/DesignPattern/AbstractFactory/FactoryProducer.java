package DesignPattern.AbstractFactory;

public class FactoryProducer {
    public static AbstractFactory getFactory(String choice){
        if (choice.equalsIgnoreCase("COLOR")){
            return new ColorFactory();
        }else if (choice.equalsIgnoreCase("SHAPE")){
            return new ShapeFactory();
        }
        return null;
    }
}
