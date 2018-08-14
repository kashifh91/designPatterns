package design.patterns.behavioural.state;

public class TVContext implements State {
  private State tvState;

  public void setState(State state) {
    this.tvState=state;
    if(state instanceof TVStartState)
      System.out.println("Switching on Home theater");
    else
      System.out.println("Switching off Home theater");
  }

  public State getState() {
    return this.tvState;
  }

  @Override
  public void doAction() {
    this.tvState.doAction();
  }

}
