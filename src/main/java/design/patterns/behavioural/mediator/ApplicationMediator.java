package design.patterns.behavioural.mediator;

import java.util.ArrayList;

public class ApplicationMediator implements Mediator {
  private ArrayList<Colleague> colleagues;

  public ApplicationMediator() {
    this.colleagues= new ArrayList<>();
  }

  public void addColleague(Colleague colleague){
    colleagues.add(colleague);
  }

  @Override
  public void send(String message, Colleague originator) {
    for (Colleague colleague:colleagues){
      if(colleague != originator)
        colleague.recieve(message);
    }
  }
}
