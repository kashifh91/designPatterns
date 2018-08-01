package design.patterns.creational.abstractFactory.colors;

public class Red implements Color {
  @Override
  public void fill() {
    System.out.println("The color fill is red");
  }
}
