public class Main {

  public static void main(String[] args) {
    System.out.println("Test 1 : mystere(12, 5)");
    int r1 = mystere(12, 5);
    System.out.println("Resultat : " + r1);

    System.out.println("\nTest 2 : mystere(48, 18)");
    int r2 = mystere(48, 18);
    System.out.println("Resultat : " + r2);
  }

  public static int mystere(int a, int b) {
    System.out.println("  mystere(" + a + ", " + b + ")");

    while (b != 0) {
      int temp = b;
      b = a % b;
      a = temp;
      System.out.println("  -> a=" + a + ", b=" + b);
    }

    return a;
  }
}
