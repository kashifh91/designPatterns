package design.patterns.behavioural.cors;

public class Rupees2KDispenser implements DispenseChain {

  private DispenseChain dispenseChain;


  @Override
  public void setNextChain(DispenseChain dispenseChain) {
    this.dispenseChain=dispenseChain;
  }

  @Override
  public void dispense(Currency currency) {

    if(2000<=currency.getAmount()){
      int num = currency.getAmount()/2000;
      int remaining= currency.getAmount()%2000;
      System.out.println("Dispensing 2000 RS notes --> "+num);
      if(this.dispenseChain!=null) {
        if (remaining != 0)
          this.dispenseChain.dispense(new Currency(remaining));
        else
          this.dispenseChain.dispense(new Currency(0));
      }
    }
  }
}
