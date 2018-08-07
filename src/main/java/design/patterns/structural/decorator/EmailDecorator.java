package design.patterns.structural.decorator;

public abstract class EmailDecorator implements EmailContent{

  EmailContent emailContent;

  public EmailDecorator(EmailContent emailContent) {
    this.emailContent = emailContent;
  }

  @Override
  public String getContents(){

    return "Decorated content : "+this.emailContent.getContents();
  }
}
