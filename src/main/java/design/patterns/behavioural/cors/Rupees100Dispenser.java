package design.patterns.behavioural.cors;

public class Rupees100Dispenser implements DispenseChain {


  DispenseChain dispenseChain;
  @Override
  public void setNextChain(DispenseChain dispenseChain) {
    this.dispenseChain=dispenseChain;
  }

  @Override
  public void dispense(Currency currency) {

    if(100<=currency.getAmount()){
      int num = currency.getAmount()/100;
      int rem= currency.getAmount()%100;
      System.out.println("Dispensing RS100 --> "+num);
      if(this.dispenseChain!=null) {
        if (rem != 0)
          this.dispenseChain.dispense(new Currency(rem));
        else
          this.dispenseChain.dispense(currency);
      }
    }
  }
}
