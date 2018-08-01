package design.patterns.creational.abstractFactory;

import design.patterns.creational.abstractFactory.colors.Color;
import design.patterns.creational.abstractFactory.shapes.Shape;

public class AbstractFactoryExecutor
{
  public static void main(String[] args) {
    GraphicAbstractFactory shapeFactory= GraphicFactoryProducer.getGraphics("SHAPE");
    GraphicAbstractFactory colorFactory= GraphicFactoryProducer.getGraphics("COLOR");

    Shape shape= shapeFactory.getShape("CIRCLE");
    shape.draw();

    Color color= colorFactory.getColor("RED");
    color.fill();
  }
}
