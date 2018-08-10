package design.patterns.behavioural.interpreter;

public interface Expression {

  String interpret(InterpreterContext ic);
}
