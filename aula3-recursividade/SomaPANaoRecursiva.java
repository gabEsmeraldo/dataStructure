public class SomaPANaoRecursiva {

  public static int somaPA(int a1, int r, int N) {
    int soma = 0;
    while (N != 0) {
      soma += a1;
      a1 += r;
      N--;
    }
    return soma;
    // return (N / 2) * (2 * a1 * (N - 1) * r);
    // return (N * (a1 + (a1 + (r * (N - 1))))) / 2;
  }

  public static void main(String[] args) {
    System.out.println(somaPA(2, 3, 5));
  }
}
