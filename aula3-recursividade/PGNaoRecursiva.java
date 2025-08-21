public class PGNaoRecursiva {

  public static int termoPG(int a1, int q, int N) {
    int potencia = (int) Math.pow(q, N - 1);
    return (a1 * potencia);
  }

  public static void main(String[] args) {
    System.out.println(termoPG(2, 3, 4));
  }
}
