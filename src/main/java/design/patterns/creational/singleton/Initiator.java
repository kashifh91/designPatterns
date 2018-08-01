package design.patterns.creational.singleton;

public class Initiator {

  private int data;

  private static Initiator instance;

  private Initiator(int data) {
    this.data = data;
  }

  public static Initiator getReference(int value) {
    if (instance == null) {
//      synchronized (Initiator.class) {
        if (instance == null) {
          instance = new Initiator(value);
        }
//      }
    }
    return instance;
  }

  public int getData() {
    return data;
  }
}
