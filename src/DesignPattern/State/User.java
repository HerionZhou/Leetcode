package DesignPattern.State;

public class User implements IUser, ISwitchState {
    IUser state = new Normal();

    @Override
    public void purchasePlus() {
        this.state = new Plus();
    }

    @Override
    public void expire() {
        this.state = new Normal();
    }

    @Override
    public void mockInterview() {
        state.mockInterview();
    }
}
