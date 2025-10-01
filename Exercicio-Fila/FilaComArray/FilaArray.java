public class FilaArray {
    private int[] dados;
    private int frente;
    private int tras;
    private int tamanho;
    private int capacidade;

    public FilaArray(int capacidade) {
        this.capacidade = capacidade;
        this.dados = new int[capacidade];
        this.frente = 0;
        this.tras = -1;
        this.tamanho = 0;
    }

    public boolean isEmpty() {
        return tamanho == 0;
    }

    public int size() {
        return tamanho;
    }

    public void enqueue(int valor) {
        if (tamanho == capacidade) {
            throw new RuntimeException("Fila cheia!");
        }
        tras = (tras + 1) % capacidade;
        dados[tras] = valor;
        tamanho++;
    }

    public int dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("Fila vazia!");
        }
        int valor = dados[frente];
        frente = (frente + 1) % capacidade;
        tamanho--;
        return valor;
    }

    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("Fila vazia!");
        }
        return dados[frente];
    }
}
