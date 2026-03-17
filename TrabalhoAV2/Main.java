public class Main {
    public static void main(String[] args) {
        FilaPrioridadeHospital fila = new FilaPrioridadeHospital();

        // Adicionando pacientes com diferentes idades
        fila.adicionarPaciente("Ana", 55);
        fila.adicionarPaciente("João", 25);
        fila.adicionarPaciente("Lucas", 30);
        fila.adicionarPaciente("Maria", 65);
        fila.adicionarPaciente("Clara", 12);
        fila.adicionarPaciente("Carlos", 70);

        // Exibindo a fila
        System.out.println("Pacientes na fila (por prioridade):");
        fila.exibirFila();

        // Removendo pacientes conforme a prioridade
        System.out.println("\nRemovendo pacientes conforme a prioridade:");
        while (!fila.estaVazia()) {
            No paciente = fila.removerPaciente();
            System.out.println("Paciente removido: " + paciente.getNome() + " - Idade: " + paciente.getIdade());
        }
    }
}
