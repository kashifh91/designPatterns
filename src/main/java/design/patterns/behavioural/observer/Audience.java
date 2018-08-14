package design.patterns.behavioural.observer;

public class Audience implements Observer {
  private String name;
  private Subject topic;

  public Audience(String name) {
    this.name = name;
  }

  @Override
  public void update() {

    String message = (String) topic.getUpdate(this);

    if(message==null)
      System.out.println("No new message..");
    else
      System.out.println("New message recieved : "+message);
  }

  @Override
  public void setSubject(Subject sub) {

    this.topic=sub;
  }
}
