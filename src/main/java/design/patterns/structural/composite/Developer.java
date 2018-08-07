package design.patterns.structural.composite;

public class Developer implements Employee {

  private String name;
  private String position;
  private int empId;

  public Developer(String name, String position, int empId) {
    this.name = name;
    this.position = position;
    this.empId = empId;
  }

  @Override
  public void showEmployeeDetails() {

    System.out.println("Developer details");
    System.out.println("Name : "+name+"  Position : "+position+" Employee ID : "+empId);
  }
}
