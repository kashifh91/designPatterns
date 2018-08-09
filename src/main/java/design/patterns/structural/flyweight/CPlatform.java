package design.patterns.structural.flyweight;

public class CPlatform implements Platform {
  public CPlatform() {
    System.out.println("C platform object created");
  }

  @Override
  public void execute(Code code) {
    System.out.println("Compliling and executing C code");
  }
}
