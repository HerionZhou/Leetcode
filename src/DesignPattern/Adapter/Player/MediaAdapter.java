package DesignPattern.Adapter.Player;

public class MediaAdapter implements MediaPlayer {
    AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(String audioType){
        if (audioType.equalsIgnoreCase("mp4")){
            advancedMediaPlayer = new Mp4Player();
        } else if (audioType.equalsIgnoreCase("avi")){
            advancedMediaPlayer = new AviPlayer();
        }
    }

    @Override
    public void play(String audioType, String filename) {
        if (audioType.equalsIgnoreCase("mp4")){
            advancedMediaPlayer.playMp4(filename);
        } else if (audioType.equalsIgnoreCase("avi")){
            advancedMediaPlayer.playAvi(filename);
        }
    }
}
