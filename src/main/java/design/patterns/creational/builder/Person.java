package design.patterns.creational.builder;

public class Person {
  private String firstName;
  private String lastName;
  private int age;
  private String aadhaar;

  private Person(String firstName, String lastName, int age, String aadhaar) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
    this.aadhaar = aadhaar;
  }
  private Person(){}

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public int getAge() {
    return age;
  }

  public String getAadhaar() {
    return aadhaar;
  }

  public static class Builder {
    private String firstName;
    private String lastName;
    private int age;
    private String aadhaar;

    public Builder setFirstName(String firstName) {
      this.firstName = firstName;
      return this;
    }

    public Builder setLastName(String lastName) {
      this.lastName = lastName;
      return this;
    }

    public Builder setAge(int age) {
      this.age = age;
      return this;
    }

    public Builder setAadhaar(String aadhaar) {
      this.aadhaar = aadhaar;
      return this;
    }

    public Person build(){
      return new Person(firstName,lastName,age,aadhaar);
    }

  }

}