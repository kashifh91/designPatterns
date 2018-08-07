package design.patterns.structural.facade;

public class Indian implements Cuisine {
  @Override
  public String getCuisine() {
    return "Dosa\nIdli\nVada\nParatha\nKhichdi\n";
  }

  @Override
  public double getPrice() {
    return 100;
  }
}
