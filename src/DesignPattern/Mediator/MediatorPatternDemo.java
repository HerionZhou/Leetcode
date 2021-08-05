package DesignPattern.Mediator;

public class MediatorPatternDemo {
    public static void main(String[] args) {
        Group group = new Group();
        Player player1 = new Player(group);
        Player player2 = new Player(group);

        player1.change(10);
        player2.change(-5);
        System.out.println("Player1剩余的钱:" + player1.money);
        System.out.println("Player2剩余的钱:" + player2.money);
    }
}
