package DesignPattern.State;

public class Normal implements IUser {
    @Override
    public void mockInterview() {
        System.out.println("模拟面试是PLUS会员专享功能");
    }
}
