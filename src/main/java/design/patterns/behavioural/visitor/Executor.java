package design.patterns.behavioural.visitor;

import java.util.ArrayList;

public class Executor {

  public static void main(String[] args) {
    ArrayList<Visitable> items = new ArrayList<>();
    items.add(new Book(19.00,10));
      //create a visitor
      PostageVisitor visitor = new PostageVisitor();
      //iterate through all items
      for(Visitable item: items) {
        item.accept(visitor);
      }
      double postage = visitor.getTotalPostage();
    System.out.println(postage);
  }
}
