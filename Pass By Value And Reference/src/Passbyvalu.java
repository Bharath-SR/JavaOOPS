public class Passbyvalu {

  public static void main(String[] args) {
    int a = 10;
    int b = 30;
    add(a, b);
    System.out.println( (a + b));
  }

  private static void add(int a, int b) {
    a = 10;
    System.out.println( (a + b));
  }
}