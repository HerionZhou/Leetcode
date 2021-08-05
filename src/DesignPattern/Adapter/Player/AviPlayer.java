package DesignPattern.Adapter.Player;

public class AviPlayer implements AdvancedMediaPlayer {
    @Override
    public void playMp4(String filename) {

    }

    @Override
    public void playAvi(String filename) {
        System.out.println("Playing avi file.  Name: " + filename);
    }
}
