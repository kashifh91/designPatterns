package design.patterns.behavioural.state;

public class TVStartState implements State {

  @Override
  public void doAction() {
    System.out.println("TV switched ON");
  }
}
