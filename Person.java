import java.lang.*;

public class Person {
  int age;

  public Person(int personAge) {
    age = personAge;
  }

  public String sayAge() {
    String message = "I'm " + age + " years old";
    return message;
  }

  public static void main(String[] args) {
    Person gabby = new Person(24);
    System.out.println(gabby.age);
    System.out.println(gabby.sayAge());
  }
}