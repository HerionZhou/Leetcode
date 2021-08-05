package DesignPattern.Chain;

public class ChainPatternDemo {
    public static void main(String[] args) {
        NewbieProgrammer newbieProgrammer = new NewbieProgrammer();
        NormalProgrammer normalProgrammer = new NormalProgrammer();

        Bug easy = new Bug(20);
        Bug middle = new Bug(40);

        newbieProgrammer.setNext(normalProgrammer);

        newbieProgrammer.handle(easy);
        newbieProgrammer.handle(middle);
    }
}
