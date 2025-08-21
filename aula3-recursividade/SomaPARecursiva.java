public class SomaPARecursiva {

  public static int somaPA(int a1, int r, int N) {
    if (N == 0) {
      return 0;
    }
    return a1 + somaPA(a1 + r, r, N - 1);
  }

  public static void main(String[] args) {
    System.out.println(somaPA(2, 3, 5));
  }
}
