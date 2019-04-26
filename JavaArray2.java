import java.lang.*;

public class JavaArray2 {

  public static void sumArrayOfElements(int[] scores) {
    int sumOfArray = 0;

    // loop through scores and add
    for (int index = 0; index < scores.length;  index++) {
       sumOfArray = sumOfArray + scores[index];
    }
    
    // print out sumOfArray
    System.out.println(sumOfArray);
  }

  public static void main(String[] args) {
    // Declare and set the values of array 'scores'
    int[] scores = {23, 10, 34, 50, 76};

    // function call passing scores as argument to the sumArrayOfElements
    sumArrayOfElements(scores);
  }
}