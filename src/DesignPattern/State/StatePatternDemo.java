package DesignPattern.State;

public class StatePatternDemo {
    public static void main(String[] args) {
        User user = new User();
        user.mockInterview();

        user.purchasePlus();
        user.mockInterview();

        user.expire();
        user.mockInterview();
    }
}
