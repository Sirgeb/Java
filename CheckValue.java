import java.lang.*;

public class CheckValue {
  public static void main(String[] args) {
    int passCode = 333;
    String message;

    switch(passCode) {
      case 333: 
        message = "you got it"; 
        break;
      case 444: 
        message = "you failed it";
        break;
      default:
        message = "you failed it keep on trying";
        break;
    }

    System.out.println(message);
  }
}