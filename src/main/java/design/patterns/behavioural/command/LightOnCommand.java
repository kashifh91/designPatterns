package design.patterns.behavioural.command;

public class LightOnCommand implements Command {
  Light light;

  public LightOnCommand(Light light) {
    this.light = light;
  }

  @Override
  public void execute() {
    System.out.println("Hukum khubool hai... ;)");
    light.switchOn();

  }
}
