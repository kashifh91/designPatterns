package design.patterns.structural.flyweight;

public class Executor {

  public static void main(String[] args) {
    Code javaCode = new Code();

    Code cCode= new Code();

    cCode.setCode("C code");

    javaCode.setCode("Java code");

    Platform platform= PlatformFactory.getPlatform("Java");

    platform.execute(javaCode);
    platform=PlatformFactory.getPlatform("C");
    platform.execute(cCode);
  }
}
