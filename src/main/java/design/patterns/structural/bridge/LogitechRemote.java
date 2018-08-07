package design.patterns.structural.bridge;

public class LogitechRemote extends RemoteTVBridge {
  public LogitechRemote(ITV tv) {
    super(tv);
  }

  @Override
  public void switchChannel(int channel) {
    System.out.print("Switching channel with Logitech remote : ");
    super.switchChannel(channel);
  }
}
