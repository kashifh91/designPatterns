package design.patterns.behavioural.command;

public class Genie {

  private Command command;

  public void setCommand(Command command) {
    this.command = command;
  }

  public void executeCommand(){
    command.execute();
  }
}
