package design.patterns.behavioural.methodTemplate;

public class Client {
  public static void main(String[] args) {
    HouseTemplate house = new WoodenHouse();
    house.buildHouse();

    System.out.println("\n\n Lets change to glass house\n\n");

    house=new GlassHouse();
    house.buildHouse();
  }
}
