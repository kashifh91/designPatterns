package design.patterns.structural.bridge;

public class Sony implements ITV {
  @Override
  public void on() {
    System.out.println("Sony TV turned on");
  }

  @Override
  public void off() {
    System.out.println("Sony TV turned off");
  }

  @Override
  public void switchChannel(int channel) {
    System.out.println("Sony : Channel -- "+channel);
  }
}
