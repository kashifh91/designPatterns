package design.patterns.behavioural.command;

public class Aladin {
  public static void main(String[] args) {
    Command commandOn = new LightOnCommand(new Light());
    Command commandOff = new LightOffCommand(new Light());
    Genie genie= new Genie();

    genie.setCommand(commandOn);
    genie.executeCommand();
    genie.setCommand(commandOff);
    genie.executeCommand();

  }
}
