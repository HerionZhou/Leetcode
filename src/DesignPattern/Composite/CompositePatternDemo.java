package DesignPattern.Composite;

public class CompositePatternDemo {
    public static void main(String[] args) {
        Manager boss = new Manager("老板", "干老板的活");
        Manager HR = new Manager("人力资源", "干人力资源的活");
        Manager PM = new Manager("产品经理", "干产品经理的活");
        Employee employee1 = new Employee("员工", "干员工的活");
        Employee employee2 = new Employee("员工", "干员工的活");
        Employee employee3 = new Employee("员工", "干员工的活");
        boss.addComponent(HR);
        boss.addComponent(PM);
        HR.addComponent(employee1);
        PM.addComponent(employee2);
        PM.addComponent(employee3);

        boss.check();
    }
}
