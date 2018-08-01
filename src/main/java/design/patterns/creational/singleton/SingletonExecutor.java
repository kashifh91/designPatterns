package design.patterns.creational.singleton;

public class SingletonExecutor {
  public static void main(String[] args) {
    Initiator initiator1= Initiator.getReference(10);
    Initiator initiator2=Initiator.getReference(20);
    System.out.println(initiator1.getData());
    System.out.println(initiator2.getData());
  }
}
