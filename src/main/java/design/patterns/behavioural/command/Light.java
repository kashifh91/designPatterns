package design.patterns.behavioural.command;

public class Light {
  private boolean swtich;

  public void switchOn(){
    swtich=true;
    System.out.println("Light turned on");
  }

  public void switchOff(){
    swtich=false;
    System.out.println("Light turned off");
  }
}
