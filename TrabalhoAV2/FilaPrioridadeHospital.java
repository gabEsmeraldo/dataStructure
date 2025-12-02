public class FilaPrioridadeHospital {
    private No[] heap;
    private int tamanho;
    private static final int CAPACIDADE_INICIAL = 10;
    private long contadorChegada; // contador simples para ordem de chegada

    public FilaPrioridadeHospital() {
        this.heap = new No[CAPACIDADE_INICIAL];
        this.tamanho = 0;
        this.contadorChegada = 0L;
    }

    // Função para adicionar paciente à fila com base na prioridade
    public void adicionarPaciente(String nome, int idade) {
        if (tamanho == heap.length) {
            redimensionar();
        }

        // Usa contador incremental para rastrear ordem de chegada (FIFO)
        long tempoChegada = contadorChegada++;
        No novoPaciente = new No(nome, idade, tempoChegada);
        heap[tamanho] = novoPaciente;
        tamanho++;

        subir(tamanho - 1);
    }

    // Função para remover o paciente de maior prioridade
    public No removerPaciente() {
        if (tamanho == 0) {
            return null;
        }

        No pacienteRemovido = heap[0];
        heap[0] = heap[tamanho - 1];
        tamanho--;
        descer(0);

        return pacienteRemovido;
    }

    // Função auxiliar para reorganizar a heap ao subir um elemento
    private void subir(int indice) {
        int indicePai = (indice - 1) / 2;
        if (indice > 0 && heap[indice].compararCom(heap[indicePai]) > 0) {
            trocar(indice, indicePai);
            subir(indicePai);
        }
    }

    // Função auxiliar para reorganizar a heap ao descer um elemento
    private void descer(int indice) {
        int indiceEsquerdo = 2 * indice + 1;
        int indiceDireito = 2 * indice + 2;
        int maior = indice;

        if (indiceEsquerdo < tamanho && heap[indiceEsquerdo].compararCom(heap[maior]) > 0) {
            maior = indiceEsquerdo;
        }

        if (indiceDireito < tamanho && heap[indiceDireito].compararCom(heap[maior]) > 0) {
            maior = indiceDireito;
        }

        if (maior != indice) {
            trocar(indice, maior);
            descer(maior);
        }
    }

    // Função auxiliar para trocar dois elementos
    private void trocar(int i, int j) {
        No temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }

    // Função para redimensionar a heap quando necessário
    private void redimensionar() {
        No[] novoArray = new No[heap.length * 2];
        System.arraycopy(heap, 0, novoArray, 0, heap.length);
        heap = novoArray;
    }

    // Função para obter o tamanho da fila
    public int tamanho() {
        return tamanho;
    }

    // Função para verificar se a fila está vazia
    public boolean estaVazia() {
        return tamanho == 0;
    }

    // Exibir os pacientes na fila
    public void exibirFila() {
        for (int i = 0; i < tamanho; i++) {
            System.out.println(heap[i].getNome() + " - Idade: " + heap[i].getIdade());
        }
    }
}
