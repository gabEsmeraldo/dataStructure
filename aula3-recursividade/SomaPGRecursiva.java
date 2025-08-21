public class SomaPGRecursiva {

  public static int SomaPG(int a1, int q, int N) {
    if (N == 0) {
      return a1;
    }
    return a1 + q * SomaPG(a1, q, N - 1);
  }

  public static void main(String[] args) {
    System.out.println(SomaPG(2, 3, 4));
  }
}
