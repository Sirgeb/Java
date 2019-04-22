public class GiveStatus {
  public static boolean isActive(boolean status) {
    if (status) {
      status = true;
    } else {
      status = false;
    }
    return status;
  }

  public static void main(String[] args) {
    System.out.println(isActive(false));
  }
}