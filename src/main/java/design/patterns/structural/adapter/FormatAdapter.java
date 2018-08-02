package design.patterns.structural.adapter;

public class FormatAdapter implements MediaPlayer {
  private MediaPackage mediaPackage;

  public FormatAdapter(MediaPackage mediaPackage) {
    this.mediaPackage = mediaPackage;
  }

  @Override
  public void play(String fileName) {
    System.out.print("Using Adapter ---> ");
    mediaPackage.playFile(fileName);

  }
}
