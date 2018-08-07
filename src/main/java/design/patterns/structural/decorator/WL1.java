package design.patterns.structural.decorator;

public class WL1 extends EmailDecorator {

  public WL1(EmailContent emailContent) {
    super(emailContent);
  }

  @Override
  public String getContents(){
    return "Dear WL1, \n"+super.getContents()+"\nHope you achieve the above :-P\nKind regards,\nObjective setter \n";
  }
}
