package design.patterns.structural.adapter;

public class Executor {

  public static void main(String[] args) {
    MediaPlayer mediaPlayer= new MP3();
    mediaPlayer.play("despacito");

    mediaPlayer=new FormatAdapter(new MP4());
    mediaPlayer.play("avengers 4K");

    mediaPlayer=new FormatAdapter(new VLC());
    mediaPlayer.play("pirate movie :-P");
  }
}
