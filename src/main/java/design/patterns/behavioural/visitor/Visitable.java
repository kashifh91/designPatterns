package design.patterns.behavioural.visitor;

public interface Visitable {
  public void accept(Visitor visitor);
}
