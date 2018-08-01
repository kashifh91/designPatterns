package design.patterns.creational.abstractFactory;

import design.patterns.creational.abstractFactory.colors.Color;
import design.patterns.creational.abstractFactory.shapes.Circle;
import design.patterns.creational.abstractFactory.shapes.Rectangle;
import design.patterns.creational.abstractFactory.shapes.Shape;
import design.patterns.creational.abstractFactory.shapes.Square;

public class ShapeFactory extends GraphicAbstractFactory {
  @Override
  Color getColor(String color) {
    return null;
  }

  @Override
  Shape getShape(String shape) {
    if(shape==null)
      return null;
    else if(shape.equalsIgnoreCase("CIRCLE"))
      return new Circle();
    else if(shape.equalsIgnoreCase("SQUARE"))
      return new Square();
    else if(shape.equalsIgnoreCase("RECTANGLE"))
      return new Rectangle();
    return null;
  }
}
