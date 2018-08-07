package design.patterns.structural.bridge;

public class BridgeExecutor {
  public static void main(String[] args) {
    LogitechRemote logitechRemote = new LogitechRemote(new Sony());
    logitechRemote.on();
    logitechRemote.switchChannel(33);
    logitechRemote.off();
  }
}
