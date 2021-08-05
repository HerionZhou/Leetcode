package DesignPattern.Adapter.Player;

public class AudioPlayer implements MediaPlayer{
    @Override
    public void play(String audioType, String filename) {
        if (audioType.equalsIgnoreCase("mp3")){
            System.out.println("Playing mp3 file. Name: " + filename);
        }
        else if (audioType.equalsIgnoreCase("mp4")
        || audioType.equalsIgnoreCase("avi")){
            MediaAdapter mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, filename);
        }
        else {
            System.out.println("格式不支持!");
        }
    }
}
