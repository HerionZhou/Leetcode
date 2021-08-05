package DesignPattern.Template;

public abstract class Game {
    abstract void startGame();
    abstract void playGame();
    abstract void closeGame();

    public final void play(){
        startGame();
        playGame();
        closeGame();
    }
}
