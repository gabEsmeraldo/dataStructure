package arvoreBinaria;

public class NoArvoreBinaria<T> {

  private T dado;
  private NoArvoreBinaria<T> esquerdo;
  private NoArvoreBinaria<T> direito;

  public NoArvoreBinaria(T dado) {
    this.dado = dado;
    this.esquerdo = null;
    this.direito = null;
  }

  public T getDado() {
    return dado;
  }

  public NoArvoreBinaria<T> getEsquerdo() {
    return esquerdo;
  }

  public NoArvoreBinaria<T> getDireito() {
    return direito;
  }

  public void setEsquerdo(NoArvoreBinaria<T> esquerdo) {
    this.esquerdo = esquerdo;
  }

  public void setDireito(NoArvoreBinaria<T> direito) {
    this.direito = direito;
  }

  public boolean isFolha() {
    return esquerdo == null && direito == null;
  }
}
