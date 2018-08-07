package design.patterns.structural.decorator;

public class Executor {
  public static void main(String[] args) {
    EmailContent objective = new Objectives("Develop and deploy FRS");

    WL1 wl1= new WL1(objective);
    WL2 wl2= new WL2(objective);

    sendMail(wl1.getContents());
    sendMail(wl2.getContents());

  }

  private static void sendMail(String contents) {
    System.out.println(contents);
  }
}
