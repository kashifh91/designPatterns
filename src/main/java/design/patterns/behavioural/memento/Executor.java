package design.patterns.behavioural.memento;

public class Executor {
  public static void main(String[] args) {
    FileWriterUtil fileWriterUtil = new FileWriterUtil("hello.txt");
    FileWriterCareTaker careTaker= new FileWriterCareTaker();

    fileWriterUtil.write("Hello this is content one");
    System.out.println(fileWriterUtil + "\n\n");
    careTaker.save(fileWriterUtil);
    fileWriterUtil.write("Corrupt data");
    System.out.println(fileWriterUtil + "\n\n");
    careTaker.undo(fileWriterUtil);
    System.out.println(fileWriterUtil + "\n\n");

  }
}
