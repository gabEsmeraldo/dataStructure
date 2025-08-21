public class somaPGNaoRecursiva {

  public static int somaPG(int a1, int q, int N) {
    int soma = 0;
    while (N != -1) {
      soma += a1 * (int) Math.pow(q, N--);
    }
    return soma;
  }

  public static void main(String[] args) {
    System.out.println(somaPG(2, 3, 4));
  }
}
