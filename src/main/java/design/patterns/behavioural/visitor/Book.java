package design.patterns.behavioural.visitor;

public class Book implements Visitable {
  private double price;
  private double weight;

  public Book(double price, double weight) {
    this.price = price;
    this.weight = weight;
  }

  //accept the visitor
  @Override
  public void accept(Visitor visitor) {
    visitor.visit(this);
  }
  public double getPrice() {
    return price;
  }
  public double getWeight() {
    return weight;
  }
}
