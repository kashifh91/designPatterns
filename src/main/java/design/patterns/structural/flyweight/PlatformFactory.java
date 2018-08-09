package design.patterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class PlatformFactory {
  private static Map<String,Platform> map =new HashMap<>();

  private PlatformFactory() {
  }

  public static synchronized Platform getPlatform(String platformType){
    Platform platform = map.get(platformType);
    if(platform==null){
      switch (platformType){
        case "Java": platform= new JavaPlatform();
                    break;
        case "C": platform = new CPlatform();
        break;

      }
      map.put(platformType,platform);

    }
    return platform;
  }
}
