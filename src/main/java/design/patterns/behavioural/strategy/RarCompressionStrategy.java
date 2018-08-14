package design.patterns.behavioural.strategy;

public class RarCompressionStrategy implements CompressionStrategy {
  @Override
  public void compressFile(String fileName) {
    System.out.println("Compressing the following file using RAR.. :"+fileName);
  }
}
