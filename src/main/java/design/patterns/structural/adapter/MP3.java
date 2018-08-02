package design.patterns.structural.adapter;

public class MP3 implements MediaPlayer {

  @Override
  public void play(String fileName) {
    System.out.println("Playing MP3 file ... "+fileName);
  }
}
