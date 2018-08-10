package design.patterns.behavioural.command;

public class LightOffCommand implements Command {
  private Light light;

  public LightOffCommand(Light light) {
    this.light = light;
  }

  @Override
  public void execute() {
    System.out.println("Hukum khubool hai.. ;)");
    light.switchOff();
  }
}
