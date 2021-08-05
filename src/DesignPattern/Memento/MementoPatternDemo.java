package DesignPattern.Memento;

public class MementoPatternDemo {
    public static void main(String[] args) {
        Player player = new Player();
        Memento memento = player.saveState();

        player.fightBoss();

        player.restoreState(memento);
    }
}
