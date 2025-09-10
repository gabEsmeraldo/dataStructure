public class ListaCircular {

  private No cursor;
  private int tamanho;

  public ListaCircular() {
    this.cursor = null;
    this.tamanho = 0;
  }

  public void inserir(int elemento) {
    No novoNo = new No(elemento);
    if (cursor == null) {
      novoNo.proximo = novoNo;
      cursor = novoNo;
    } else {
      novoNo.proximo = cursor.proximo;
      cursor.proximo = novoNo;
      cursor = cursor.proximo;
    }
    tamanho++;
  }

  public void remove() {
    if (estaVazio()) {
      throw new IllegalStateException("Lista vazia");
    }
    if (cursor.proximo == cursor) {
      cursor = null;
    } else {
      cursor.proximo = cursor.proximo.proximo;
    }
    tamanho--;
  }

  public boolean estaVazio() {
    return tamanho == 0;
  }

  public int pegaElemento() {
    if (estaVazio()) {
      throw new IllegalStateException("Lista vazia");
    }
    return cursor.proximo.elemento;
  }

  public void avanca() {
    if (!estaVazio()) {
      cursor = cursor.proximo;
    }
  }

  public int tamanho() {
    return tamanho;
  }
}
