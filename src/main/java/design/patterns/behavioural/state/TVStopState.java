package design.patterns.behavioural.state;

public class TVStopState implements State {
  @Override
  public void doAction() {
    System.out.println("TV switched OFF");
  }
}
