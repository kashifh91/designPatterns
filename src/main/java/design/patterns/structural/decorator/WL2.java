package design.patterns.structural.decorator;

public class WL2 extends EmailDecorator {
  public WL2(EmailContent emailContent) {
    super(emailContent);
  }

  @Override
  public String getContents(){
    return "Dear WL2,\n"+super.getContents()+"\n Hope your team achieves it.. ;-) \nKind regards,\nObjective setter \n";
  }
}
