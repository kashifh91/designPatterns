package design.patterns.structural.facade;

public class Continental implements Cuisine {
  @Override
  public String getCuisine() {
    return "Burger\nSandwich\nPasta\n";
  }

  @Override
  public double getPrice() {
    return 60;
  }
}
