package design.patterns.structural.flyweight;

public class JavaPlatform implements Platform {

  public JavaPlatform() {
    System.out.println("Java platform created");
  }

  @Override
  public void execute(Code code) {
    System.out.println("Compiling and executing Java code");
  }
}
