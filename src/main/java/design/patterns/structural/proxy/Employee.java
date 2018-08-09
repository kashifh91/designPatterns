package design.patterns.structural.proxy;

public class Employee {
  public static void main(String[] args) {
    Internet internet=new ProxyInternet();
    try {
//      internet.connectTo("tesco.com");
      internet.connectTo("facebook.com");
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
