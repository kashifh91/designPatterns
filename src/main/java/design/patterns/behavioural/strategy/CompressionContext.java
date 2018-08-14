package design.patterns.behavioural.strategy;

public class CompressionContext {
  private CompressionStrategy compressionStrategy;

  public void setCompressionStrategy(CompressionStrategy compressionStrategy) {
    this.compressionStrategy = compressionStrategy;
  }

  public void compressFile(String fileName){
    compressionStrategy.compressFile(fileName);
  }
}
