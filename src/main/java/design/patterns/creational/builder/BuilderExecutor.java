package design.patterns.creational.builder;

public class BuilderExecutor {
  public static void main(String[] args) {
    Person person= new Person.Builder()
                    .setFirstName("Kashif")
                    .setLastName("Hamad")
                    .setAge(26)
                    .setAadhaar("aadhaar")
                    .build();

    System.out.println(person.getFirstName()+"\t"+person.getLastName()+"\t"+person.getAge()+"\t"+person.getAadhaar());
  }
}
