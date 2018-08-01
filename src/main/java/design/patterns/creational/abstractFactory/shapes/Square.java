package design.patterns.creational.abstractFactory.shapes;

public class Square implements Shape {
  @Override
  public void draw() {
    System.out.println("Shape is Square");
  }
}
