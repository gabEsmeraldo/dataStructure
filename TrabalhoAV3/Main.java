package TrabalhoAV3;

import java.util.PriorityQueue;

public class Main {
    static class Paciente implements Comparable<Paciente> {
        private final String nome;
        private final int idade;
        private final long tempoChegada; // Momento que o paciente chegou
        
        
        private static final int PRIORIZACAO_ALTA = 3; // Idades acima de 60
        private static final int PRIORIZACAO_MEDIA = 2; // Idades entre 40-60
        private static final int PRIORIZACAO_CRIANCA = 1; // Idades abaixo de 16 (maior que normal)
        private static final int PRIORIZACAO_BAIXA = 0; // Idades entre 16-39
        
        public Paciente(String nome, int idade, long tempoChegada) {
            this.nome = nome;
            this.idade = idade;
            this.tempoChegada = tempoChegada;
        }
        
        
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

        @Override
        public int compareTo(Paciente outro) {
            int diferencaPrioridade = outro.obterPrioridade() - this.obterPrioridade();
            
            if (diferencaPrioridade != 0) {
                return diferencaPrioridade;
            }
            return Long.compare(this.tempoChegada, outro.tempoChegada);
        }
        
        public String getNome() {
            return nome;
        }
        
        public int getIdade() {
            return idade;
        }
        
        public long getTempoChegada() {
            return tempoChegada;
        }
    }
    
    public static void main(String[] args) {
        PriorityQueue<Paciente> fila = new PriorityQueue<>();
        long contadorChegada = 0L;
        
        fila.add(new Paciente("Ana", 55, contadorChegada++));
        fila.add(new Paciente("João", 25, contadorChegada++));
        fila.add(new Paciente("Lucas", 30, contadorChegada++));
        fila.add(new Paciente("Maria", 65, contadorChegada++));
        fila.add(new Paciente("Clara", 12, contadorChegada++));
        fila.add(new Paciente("Carlos", 70, contadorChegada++));
        
        System.out.println("\nRemovendo pacientes conforme a prioridade:");
        while (!fila.isEmpty()) {
            Paciente paciente = fila.poll();
            System.out.println("Paciente removido: " + paciente.getNome() + " - Idade: " + paciente.getIdade());
        }
    }
}