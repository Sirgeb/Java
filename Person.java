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
    Person Gabriel = new Person(24);
    Person Ngozi = new Person(32);  
    System.out.println(Gabriel.sayAge());
    System.out.println(Gabriel.age);
    System.out.println(Ngozi.age);
    System.out.println(Ngozi.sayAge()); 
  }

}