package design.patterns.structural.decorator;

public class Objectives implements EmailContent {

  private String Objectives;

  public Objectives(String objectives) {
    Objectives = objectives;
  }

  @Override
  public String getContents() {
    return this.Objectives;
  }
}
