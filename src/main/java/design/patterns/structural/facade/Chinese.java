package design.patterns.structural.facade;

public class Chinese implements Cuisine {
  @Override
  public String getCuisine() {
    return "Hakka noodles\nManchurian\n Drums of heaven\n";
  }

  @Override
  public double getPrice() {
    return 50;
  }
}
