package design.patterns.behavioural.observer;

public interface Observer {
  public void update();
  public void setSubject(Subject sub);
}
