package design.patterns.creational.abstractFactory;

import design.patterns.creational.abstractFactory.colors.Color;
import design.patterns.creational.abstractFactory.shapes.Shape;

public abstract class GraphicAbstractFactory {
  abstract Color getColor(String color);
  abstract Shape getShape(String shape);
}
