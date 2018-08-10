package design.patterns.behavioural.cors;

public class Executor {

  DispenseChain dispenseChain1;

  public Executor() {
    this.dispenseChain1 = new Rupees2KDispenser();
    DispenseChain dispenseChain2 = new Rupees500Dispenser();
    DispenseChain dispenseChain3 = new Rupees100Dispenser();

    dispenseChain1.setNextChain(dispenseChain2);
    dispenseChain2.setNextChain(dispenseChain3);
  }

  public static void main(String[] args) {

    Executor executor= new Executor();

    Currency currency = new Currency(4900);
    executor.dispenseChain1.dispense(currency);
  }
}
