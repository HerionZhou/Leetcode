package DesignPattern.Prototype;

public class MilkTea implements Cloneable {
    private String type;
    private boolean ice;
    public MilkTea(String type, boolean ice){
        this.type = type;
        this.ice = ice;
    }

    @Override
    protected MilkTea clone() throws CloneNotSupportedException {
        return (MilkTea) super.clone();
    }
}
