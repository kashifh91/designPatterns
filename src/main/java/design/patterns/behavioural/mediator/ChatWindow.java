package design.patterns.behavioural.mediator;

public class ChatWindow {
  public static void main(String[] args) {
    ApplicationMediator mediator= new ApplicationMediator();
    Colleague desktopColleague= new DesktopColleague(mediator);
    Colleague mobileColleague= new MobileColleague(mediator);

    mediator.addColleague(desktopColleague);
    mediator.addColleague(mobileColleague);

    desktopColleague.send("Hi Desktop colleague here");

    mobileColleague.send("Hi Mobile here");
  }
}
