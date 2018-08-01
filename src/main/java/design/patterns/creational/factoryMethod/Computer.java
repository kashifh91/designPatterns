package design.patterns.creational.factoryMethod;

public interface Computer {
  public String getRAM();
  public String getHDD();
  public String getCPU();


  default String strValues(){
    return "RAM= "+this.getRAM()+", HDD="+this.getHDD()+", CPU="+this.getCPU();
  }
}
