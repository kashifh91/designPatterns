package design.patterns.behavioural.strategy;

public class ZipCompressionStrategy implements CompressionStrategy {
  @Override
  public void compressFile(String fileName) {
    System.out.println("Compressing the following file using ZIP.. :"+fileName);
  }
}
