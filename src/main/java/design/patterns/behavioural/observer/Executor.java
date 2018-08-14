package design.patterns.behavioural.observer;

public class Executor {

  public static void main(String[] args) {
    TechTalks subject = new TechTalks();

    Observer observer1= new Audience("Kashif");
    Observer observer2= new Audience("Akshay");
    Observer observer3= new Audience("Lenin");
    Observer observer4= new Audience("Sunil");
    Observer observer5= new Audience("Mishank");

    subject.register(observer1);
//    subject.register(observer2);
//    subject.register(observer3);
//    subject.register(observer4);
//    subject.register(observer5);

    observer1.setSubject(subject);
    observer2.setSubject(subject);
    observer3.setSubject(subject);
    observer4.setSubject(subject);
    observer5.setSubject(subject);


    subject.postMessage("Welcome folks");

    observer2.update();
    observer3.update();
    observer4.update();
    observer5.update();


  }


}
