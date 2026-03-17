package arvoreBinaria;

public class ArvoreBinaria<T> {

  private NoArvoreBinaria<T> raiz;

  public ArvoreBinaria(NoArvoreBinaria<T> raiz) {
    this.raiz = raiz;
  }

  public NoArvoreBinaria<T> getRaiz() {
    return raiz;
  }

  public void preOrdem() {
    preOrdem(raiz);
  }

  private void preOrdem(NoArvoreBinaria<T> no) {
    if (no != null) {
      System.out.print(no.getDado() + " ");
      preOrdem(no.getEsquerdo());
      preOrdem(no.getDireito());
    }
  }

  public void inOrdem() {
    inOrdem(raiz);
  }

  private void inOrdem(NoArvoreBinaria<T> no) {
    if (no != null) {
      inOrdem(no.getEsquerdo());
      System.out.print(no.getDado() + " ");
      inOrdem(no.getDireito());
    }
  }

  public void posOrdem() {
    posOrdem(raiz);
  }

  private void posOrdem(NoArvoreBinaria<T> no) {
    if (no != null) {
      posOrdem(no.getEsquerdo());
      posOrdem(no.getDireito());
      System.out.print(no.getDado() + " ");
    }
  }

  public int contarNos() {
    return contarNos(raiz);
  }

  private int contarNos(NoArvoreBinaria<T> no) {
    if (no == null) return 0;
    return 1 + contarNos(no.getEsquerdo()) + contarNos(no.getDireito());
  }

  public int altura() {
    return altura(raiz);
  }

  private int altura(NoArvoreBinaria<T> no) {
    if (no == null) return -1;
    int altEsq = altura(no.getEsquerdo());
    int altDir = altura(no.getDireito());
    return 1 + Math.max(altEsq, altDir);
  }
}
