package design.patterns.structural.proxy;

import java.util.ArrayList;
import java.util.List;

public class ProxyInternet implements Internet {
  private Internet internet = new OfficeInternet();
  private static List<String> bannedSites = new ArrayList<>();

  static {
    bannedSites.add("facebook.com");
    bannedSites.add("twitter.com");
    bannedSites.add("hotstar.com");
  }

  @Override
  public void connectTo(String host) throws Exception {
    if(!bannedSites.contains(host)){
      System.out.println("You are a rule follower :-D :-)");
      internet.connectTo(host);
    }
    else{
      System.out.println("Time pass in office is restricted, appreciate you tried ;-) ");
      throw new Exception("Policy Breached !! Nikalo isko..");
    }
  }
}
