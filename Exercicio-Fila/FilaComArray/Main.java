public class Main {
    public static void main(String[] args) {
        FilaArray fila = new FilaArray(5);

        System.out.println("Fila está vazia? " + fila.isEmpty());

        fila.enqueue(10);
        fila.enqueue(20);
        fila.enqueue(30);

        System.out.println("Elemento na frente: " + fila.peek());
        System.out.println("Tamanho da fila: " + fila.size());

        System.out.println("Removendo: " + fila.dequeue());
        System.out.println("Elemento na frente agora: " + fila.peek());

        fila.enqueue(40);
        fila.enqueue(50);
        fila.enqueue(60); // Deve preencher a fila

        try {
            fila.enqueue(70); // Deve lançar exceção (fila cheia)
        } catch (RuntimeException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        while (!fila.isEmpty()) {
            System.out.println("Removendo: " + fila.dequeue());
        }

        System.out.println("Fila está vazia? " + fila.isEmpty());
    }
}
