package design.patterns.behavioural.mediator;

public class DesktopColleague extends Colleague {
  public DesktopColleague(Mediator mediator) {
    super(mediator);
  }

  @Override
  public void recieve(String message) {
    System.out.println("Desktop colleage recieved following message : "+message);
  }
}
