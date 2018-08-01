package design.patterns.creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class Employees implements Cloneable {

  private List<String> employeeList;

  public Employees() {
    this.employeeList=new ArrayList<>();
  }

  public Employees(List<String> employeeList) {
    this.employeeList = employeeList;
  }

  public void loadData(){
    employeeList.add("Kashif");
    employeeList.add("Akshay");
    employeeList.add("Mishank");
  }

  @Override
  public Object clone(){
    List<String> temp = new ArrayList<>();
    employeeList.forEach(employee-> temp.add(employee));
    return new Employees(temp);
  }

  public List<String> getEmpList() {
    return this.employeeList;
  }
}
