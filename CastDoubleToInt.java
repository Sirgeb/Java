public class CastDoubleToInt {

  public static int rollDice(int sides) {
    double randomNumber = Math.random();
    randomNumber = randomNumber * sides;
    int randomInt = (int) randomNumber;
    return randomInt;
  }

  public static void main(String[] args) {
    System.out.println(rollDice(6));
  }
}