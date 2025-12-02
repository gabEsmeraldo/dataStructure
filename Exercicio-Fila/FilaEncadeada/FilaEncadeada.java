public class FilaEncadeada {
    private No frente;
    private No tras;
    private int tamanho;

    public FilaEncadeada() {
        this.frente = null;
        this.tras = null;
        this.tamanho = 0;
    }

    public boolean isEmpty() {
        return frente == null;
    }

    public int size() {
        return tamanho;
    }

    public void enqueue(int valor) {
        No novo = new No(valor);
        if (tras != null) {
            tras.proximo = novo;
        }
        tras = novo;
        if (frente == null) {
            frente = tras;
        }
        tamanho++;
    }

    public int dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("Fila vazia!");
        }
        int valor = frente.valor;
        frente = frente.proximo;
        if (frente == null) {
            tras = null;
        }
        tamanho--;
        return valor;
    }

    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("Fila vazia!");
        }
        return frente.valor;
    }
}
