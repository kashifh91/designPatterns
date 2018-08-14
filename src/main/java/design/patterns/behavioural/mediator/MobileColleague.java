package design.patterns.behavioural.mediator;

public class MobileColleague extends Colleague {

  public MobileColleague(Mediator mediator) {
    super(mediator);
  }

  @Override
  public void recieve(String message) {
    System.out.println("Mobile Colleague recieved the following message : "+message);
  }
}
