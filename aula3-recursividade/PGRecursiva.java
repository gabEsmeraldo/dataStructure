public class PGRecursiva {

  public static int termoPG(int a1, int q, int N) {
    if (N == 1) {
      return a1;
    }
    return q * termoPG(a1, q, N - 1);
  }

  public static void main(String[] args) {
    System.out.println(termoPG(2, 3, 4));
  }
}
