package design.patterns.structural.composite;

public class ResourceAllocator {
  public static void main(String[] args) {
    Developer dev1= new Developer("Kashif","SSE",1);
    Developer dev2= new Developer("Akshay","SSE", 2);
    Developer dev3= new Developer("Mishank","SE", 3);
    Developer dev4= new Developer("Sunil","ASD", 4);

    Manager manager1= new Manager("Raj", 10,"SDM");
    Manager manager2= new Manager("Veena", 11, "TPM");
    Manager manager3= new Manager("Komala", 12, "PM");
    Head financeHead = new Head("Anjan",100,"HOSD");

    financeHead.addReportee(dev1);
    financeHead.addReportee(dev2);
    financeHead.addReportee(manager1);
    financeHead.showEmployeeDetails();

    financeHead.addReportee(dev3);
    financeHead.addReportee(dev4);
    financeHead.addReportee(manager2);
    financeHead.addReportee(manager3);
    financeHead.showEmployeeDetails();

  }
}
