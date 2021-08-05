package DesignPattern.Composite;

public class Employee extends Component {
    public Employee(String position, String job) {
        super(position, job);
    }

    @Override
    void check() {
        work();
    }
}
