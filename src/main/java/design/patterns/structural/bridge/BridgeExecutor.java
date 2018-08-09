package design.patterns.structural.bridge;

public class BridgeExecutor {
  public static void main(String[] args) {
    LogitechRemote logitechRemote = new LogitechRemote(new Samsung());
    logitechRemote.on();
    logitechRemote.switchChannel(33);
    logitechRemote.off();
  }
}
