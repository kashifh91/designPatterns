package design.patterns.creational.abstractFactory;

public class GraphicFactoryProducer  {

  public static GraphicAbstractFactory getGraphics(String choice){
    if(choice.equalsIgnoreCase("SHAPE"))
      return new ShapeFactory();
    else if(choice.equalsIgnoreCase("COLOR"))
      return new ColorFactory();
    return null;
  }
}
