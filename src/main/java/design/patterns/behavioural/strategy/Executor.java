package design.patterns.behavioural.strategy;

public class Executor {
  public static void main(String[] args) {
    CompressionContext compressionContext = new CompressionContext();

    compressionContext.setCompressionStrategy(new RarCompressionStrategy());
    compressionContext.compressFile("Uncompressed.txt");
  }
}
