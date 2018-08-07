package design.patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Head implements Employee {
  private String name;
  private int empId;
  private String position;
  private List<Employee> reportees;

  public Head(String name, int empId, String position) {
    this.name = name;
    this.empId = empId;
    this.position = position;
    reportees= new ArrayList<>();
  }

  @Override
  public void showEmployeeDetails() {
    System.out.println("Head details:");
    System.out.println("name : "+name+" empId : "+empId+" position : "+position);
    System.out.println("Reportee Details");
    reportees.forEach(employee -> employee.showEmployeeDetails());
  }

  public void addReportee(Employee employee){
    reportees.add(employee);
  }

  public void removeReportee(Employee employee){
    reportees.remove(employee);
  }
}
