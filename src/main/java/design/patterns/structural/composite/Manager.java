package design.patterns.structural.composite;

public class Manager implements Employee {
  private String name;
  private int empId;
  private String position;

  public Manager(String name, int empId, String position) {
    this.name = name;
    this.empId = empId;
    this.position = position;
  }

  @Override
  public void showEmployeeDetails() {

    System.out.println("Manager details");
    System.out.println("name : "+name+" empID : "+empId+" position : "+position);

  }
}
