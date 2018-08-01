package design.patterns.creational.abstractFactory;

import design.patterns.creational.abstractFactory.colors.Blue;
import design.patterns.creational.abstractFactory.colors.Color;
import design.patterns.creational.abstractFactory.colors.Green;
import design.patterns.creational.abstractFactory.colors.Red;
import design.patterns.creational.abstractFactory.shapes.Shape;

public class ColorFactory extends GraphicAbstractFactory {
  @Override
  Color getColor(String color) {
    if(color == null){
      return null;
    }

    if(color.equalsIgnoreCase("RED")){
      return new Red();

    }else if(color.equalsIgnoreCase("GREEN")){
      return new Green();

    }else if(color.equalsIgnoreCase("BLUE")){
      return new Blue();
    }

    return null;
  }

  @Override
  Shape getShape(String shape) {
    return null;
  }
}
