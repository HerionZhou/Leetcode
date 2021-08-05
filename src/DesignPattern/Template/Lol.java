package DesignPattern.Template;

public class Lol extends Game {
    @Override
    void startGame() {
        System.out.println("打开LOL");
    }

    @Override
    void playGame() {
        System.out.println("玩LOL");
    }

    @Override
    void closeGame() {
        System.out.println("关闭LOL");
    }
}
