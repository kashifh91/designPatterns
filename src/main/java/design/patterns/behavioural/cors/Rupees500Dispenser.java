package design.patterns.behavioural.cors;

public class Rupees500Dispenser implements DispenseChain {
  DispenseChain dispenseChain;

  @Override
  public void setNextChain(DispenseChain dispenseChain) {
    this.dispenseChain=dispenseChain;
  }

  @Override
  public void dispense(Currency currency) {

    if(500<=currency.getAmount()){
      int num = currency.getAmount() / 500;
      int rem = currency.getAmount() % 500;
      System.out.println("Dispensing RS500 --> "+num);
      if(rem!=0)
        dispenseChain.dispense(new Currency(rem));
      else
        this.dispenseChain.dispense(new Currency(0));
    }
  }
}
