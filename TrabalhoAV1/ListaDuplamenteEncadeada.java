public class ListaDuplamenteEncadeada {

  protected No cabeca;
  protected No cauda;
  protected int tamanho;

  // protected No cursor;

  public ListaDuplamenteEncadeada() {
    cabeca = null;
    cauda = null;
  }

  public void quantidadePedidosRestantes() {
    System.out.println(tamanho);
  }

  public void adicionarPedido(Pedido pedido) {
    No no = new No(pedido);
    if (cabeca == null) {
      cabeca = no;
      cauda = no;
    } else {
      cauda.setProximo(no);
      no.setAnterior(cauda);
      cauda = no;
    }
    tamanho++;
  }

  public void removerPedido() {
    if (cabeca != null) {
      cabeca = cabeca.getProximo();
    } else {
      System.out.println("Não há pedidos a serem removidos");
      return;
    }
    tamanho--;
  }

  public void removerPedido(int pos) {
    if (cabeca != null && pos == 0) {
      cabeca = cabeca.getProximo();
    } else if (pos == tamanho - 1) {
        cauda = cauda.getAnterior();
        cauda.setProximo(null);
    }else if (pos < tamanho) {
      int posAtual = 0;
      No cursor = cabeca;
      while (posAtual < pos) {
        cursor = cursor.getProximo();
        posAtual++;
      }
      cursor.getAnterior().setProximo(cursor.getProximo());
      cursor.getProximo().setAnterior(cursor.getAnterior());
    }
    tamanho--;
  }

  public void listarPedidos() {
    No cursor = cabeca;
    while (cursor != null) {
      Pedido elemento = cursor.getElemento();
      elemento.listarPedido();
      if (cursor.getProximo() != null) {
        cursor = cursor.getProximo();
      } else {
        return;
      }
    }
  }

  public Pedido getPedido(int pos) {
    if (pos >= tamanho) {
      System.out.println("Posição inexistente");
      return null;
    }
    No cursor = cabeca;
    int posAtual = 0;
    while (posAtual < pos) {
      cursor = cursor.getProximo();
      posAtual++;
    }
    return cursor.getElemento();
  }
}
