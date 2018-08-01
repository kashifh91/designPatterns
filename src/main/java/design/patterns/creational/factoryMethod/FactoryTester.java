package design.patterns.creational.factoryMethod;

public class FactoryTester {
  public static void main(String[] args) {
    Computer pc = ComputerFactory.getComputer("PC","2GB","500GB","Dual core");
    Computer server =  ComputerFactory.getComputer("Server","32GB","5TB","16 cores");
    System.out.println(pc.strValues());
    System.out.println(server.strValues());
  }
}
