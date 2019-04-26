import java.lang.*;

public class JavaArray {
  public static void main(String[] args) {
    int[] score = new int[5];
    score[0] = 1;
    score[1] = 2;
    score[2] = 3;
    score[3] = 4;
    score[4] = 5;
    
    int sum = 0;
    for(int i = 0; i < score.length; i++) {
      // System.out.println(score[i]);
      sum += score[i];
    }

    System.out.println("The total sum of integers in the array is " + sum);
    
    String[] names = {"ngozi", "obi", "chioma"};
    System.out.println(names[0]);
    System.out.println(names.length);
  }
}