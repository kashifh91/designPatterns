package design.patterns.structural.facade;

public class Executor {
  public static void main(String[] args) {
    MenuFacade menuFacade= new MenuFacade();
    menuFacade.getChineseMenu();
    menuFacade.getContinentalMenu();
    menuFacade.getIndianMenu();
  }
}
