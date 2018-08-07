package design.patterns.structural.bridge;

public abstract class RemoteTVBridge {

  ITV tv;

  public RemoteTVBridge(ITV tv) {
    this.tv=tv;
  }

  public void on(){
   tv.on();
  }

  public void off(){
    tv.off();
  }
  public void switchChannel(int channel){
    tv.switchChannel(channel);
  }
}
