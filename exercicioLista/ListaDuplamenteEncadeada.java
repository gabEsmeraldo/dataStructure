class ListaDuplamenteEncadeada {

  private No cabeca;
  private No cauda;
  private int tamanho;
  private No cursor;

  public ListaDuplamenteEncadeada() {
    this.cabeca = null;
    this.cauda = null;
    this.tamanho = 0;
    this.cursor = null;
  }

  public boolean estaVazio() {
    return tamanho == 0;
  }

  public int pegaElemento(int posicao) {
    if (posicao < 0 || posicao >= tamanho) throw new IndexOutOfBoundsException(
      "Posição inválida!"
    );
    No atual = cabeca;
    for (int i = 0; i < posicao; i++) {
      atual = atual.proximo;
    }
    return atual.elemento;
  }

  public void alteraElemento(int elemento, int posicao) {
    if (posicao < 0 || posicao >= tamanho) throw new IndexOutOfBoundsException(
      "Posição inválida!"
    );
    No atual = cabeca;
    for (int i = 0; i < posicao; i++) {
      atual = atual.proximo;
    }
    atual.elemento = elemento;
  }

  public int tamanho() {
    return tamanho;
  }

  private int pegaPosicao(No no) {
    No atual = cabeca;
    int posicao = 0;
    while (atual != no) {
      atual = atual.proximo;
      posicao++;
    }
    return posicao;
  }

  public void imprimirLista() {
    No atual = cabeca;
    while (atual != null) {
      System.out.print(atual.elemento + " ");
      atual = atual.proximo;
    }
    System.out.println();
  }

  public int pegaPrimeiro() {
    cursor = cabeca;
    return (cabeca != null) ? cabeca.elemento : 0;
  }

  public int pegaProximo() {
    if (cursor == null || cursor.proximo == null) return 0;
    cursor = cursor.proximo;
    return cursor.elemento;
  }

  public int pegaUltimo() {
    cursor = cauda;
    return (cauda != null) ? cauda.elemento : 0;
  }

  public int pegaAnterior() {
    if (cursor == null || cursor.anterior == null) return 0;
    cursor = cursor.anterior;
    return cursor.elemento;
  }

  public void inserir(int num, int pos) {
    No no = new No(num);
    if (pos == 0) {
      inserirNoInicio(num);
    } else {
      cursor = cabeca;
      int posAtual = 0;
      while (cursor != null && posAtual < pos) {
        cursor = cursor.proximo;
        posAtual++;
      }
      if (cursor == null) {
        inserirNoFim(num);
      } else {
        no.proximo = cursor;
        no.anterior = cursor.anterior;
        cursor.anterior.proximo = no;
        cursor.anterior = no;
      }
    }
    tamanho++;
  }

  public void inserirNoInicio(int num) {
    No no = new No(num);
    if (cabeca == null) {
      cabeca = no;
      cauda = no;
    } else {
      no.proximo = cabeca;
      cabeca.anterior = no;
      cabeca = no;
    }
    tamanho++;
  }

  public void inserirNoFim(int num) {
    No no = new No(num);
    if (cauda == null) {
      cabeca = no;
      cauda = no;
    } else {
      cauda.proximo = no;
      no.anterior = cauda;
      cauda = no;
    }
    tamanho++;
  }

  public void removerNoInicio() {
    if (cabeca == null) {
      return;
    }

    if (cabeca == cauda) {
      cabeca = null;
      cauda = null;
      return;
    }

    cursor = cabeca;
    cabeca = cabeca.proximo;
    cabeca.anterior = null;
    cursor.proximo = null;
  }

  public void remover(int pos) {
    if (cabeca == null) {
      return;
    }
    if (pos == 0) {
      removerNoInicio();
      return;
    }
    cursor = cabeca;
    int posAtual = 0;
    while (cursor != null && posAtual != pos) {
      cursor = cursor.proximo;
      posAtual++;
    }
    if (cursor == null) {
      System.out.println("Posição invalida!");
      return;
    }
    if (cursor == cauda) {
      removerNoFim();
      return;
    }
    cursor.anterior.proximo = cursor.proximo;
    cursor.proximo.anterior = cursor.anterior;
    cursor.anterior = null;
    cursor.proximo = null;
  }

  public void removerNoFim() {
    if (cauda == null) {
      return;
    }

    if (cauda == cabeca) {
      cabeca = null;
      cauda = null;
      return;
    }

    cursor = cauda;
    cauda = cauda.anterior;
    cauda.proximo = null;
    cursor.anterior = null;
  }
}
