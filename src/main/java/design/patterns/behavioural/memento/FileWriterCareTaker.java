package design.patterns.behavioural.memento;

public class FileWriterCareTaker {

  Object object;

  public void save(FileWriterUtil fileWriterUtil){
    this.object=fileWriterUtil.save();
  }

  public void undo(FileWriterUtil fileWriterUtil){
    fileWriterUtil.undoToLastSave(object);
  }
}
