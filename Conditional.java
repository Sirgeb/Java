import java.lang.*;

public class Conditional {
  public static String checkEquality(int a, int b) {
    String message;

    if (a == b) {
      message = "They are equal";
      return message;
    } else {
      message = "They are not equal";
      return message;
    }
  }
  public static void main(String[] args) {
    int a = 4; 
    int b = 3;

    System.out.println(checkEquality(a, b));
  }
}