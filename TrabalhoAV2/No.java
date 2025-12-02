public class No {
    private String nome;
    private int idade;
    private long tempoChegada; // Momento que o paciente chegou

    // Definir os intervalos de prioridade
    private static final int PRIORIZACAO_ALTA = 3; // Idades acima de 60
    private static final int PRIORIZACAO_MEDIA = 2; // Idades entre 40-60
    private static final int PRIORIZACAO_CRIANCA = 1; // Idades abaixo de 16 (maior que normal)
    private static final int PRIORIZACAO_BAIXA = 0; // Idades entre 16-39

    public No(String nome, int idade, long tempoChegada) {
        this.nome = nome;
        this.idade = idade;
        this.tempoChegada = tempoChegada;
    }

    // Função para comparar a prioridade entre dois pacientes
    // Primeiro compara por prioridade, depois por ordem de chegada (FIFO dentro da mesma prioridade)
    public int compararCom(No outroPaciente) {
        int diferencaPrioridade = obterPrioridade() - outroPaciente.obterPrioridade();
        
        // Se as prioridades são diferentes, retorna a diferença
        if (diferencaPrioridade != 0) {
            return diferencaPrioridade;
        }
        
        // Se as prioridades são iguais, compara por ordem de chegada (menor tempo = chegou antes = maior prioridade)
        // Mas como queremos FIFO, quem chegou primeiro deve sair primeiro
        // Como estamos em um max heap, invertemos para que quem chegou primeiro tenha "menor prioridade no heap"
        // Na verdade, precisamos pensar: no heap, queremos que o primeiro a chegar esteja no topo quando prioridades são iguais
        // Então: tempo menor = chegou antes = deve estar acima no heap
        // Mas em um max heap, valores maiores ficam no topo. Então precisamos inverter:
        // Quem chegou primeiro (tempo menor) deve ter comparação que o coloque acima
        // Para isso, comparamos inversamente: outro.tempoChegada - this.tempoChegada
        // Isso faz com que tempo menor (chegou antes) resulte em valor positivo (maior no heap)
        return Long.compare(outroPaciente.tempoChegada, this.tempoChegada);
    }

    // Função para obter a prioridade do paciente com base na idade
    public int obterPrioridade() {
        if (idade > 60) {
            return PRIORIZACAO_ALTA;
        } else if (idade >= 40) {
            return PRIORIZACAO_MEDIA;
        } else if (idade < 16) {
            return PRIORIZACAO_CRIANCA;
        } else {
            return PRIORIZACAO_BAIXA;
        }
    }

    // Método para obter o tempo de chegada
    public long getTempoChegada() {
        return tempoChegada;
    }

    // Métodos de acesso
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }
}
