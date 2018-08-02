package design.patterns.structural.adapter;

public class MP4 implements MediaPackage {
  @Override
  public void playFile(String fileName) {
    System.out.println("Playing MP4 file ....... "+fileName);
  }
}
