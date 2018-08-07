package design.patterns.structural.facade;

public class MenuFacade {
  private Cuisine chinese;
  private Cuisine continental;
  private Cuisine indian;

  public MenuFacade() {
    this.chinese = new Chinese();
    this.continental = new Continental();
    this.indian = new Indian();
  }

  public void getChineseMenu(){
    System.out.println("\n\nChinese :\n"+chinese.getCuisine()+" Price: "+chinese.getPrice());
  }
  public void getContinentalMenu(){
    System.out.println("\n\nContinental :\n"+continental.getCuisine()+" Price: "+continental.getPrice());
  }
  public void getIndianMenu(){
    System.out.println("\n\nIndian :\n"+indian.getCuisine()+" Price: "+indian.getPrice());
  }
}
