package DesignPattern.Composite;

public abstract class Component {
    private String position;
    private String job;

    public Component(String position, String job){
        this.position = position;
        this.job = job;
    }

    public void work(){
        System.out.println("这位" + position + "，正在做" + job);
    }

    abstract void check();

}
