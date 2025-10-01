public class Main {
    public static void main(String[] args) {
        FilaEncadeada fila = new FilaEncadeada();

        System.out.println("Fila está vazia? " + fila.isEmpty());

        fila.enqueue(100);
        fila.enqueue(200);
        fila.enqueue(300);

        System.out.println("Elemento na frente: " + fila.peek());
        System.out.println("Tamanho da fila: " + fila.size());

        System.out.println("Removendo: " + fila.dequeue());
        System.out.println("Elemento na frente agora: " + fila.peek());

        fila.enqueue(400);
        fila.enqueue(500);

        while (!fila.isEmpty()) {
            System.out.println("Removendo: " + fila.dequeue());
        }

        System.out.println("Fila está vazia? " + fila.isEmpty());

        try {
            fila.dequeue(); // Deve lançar exceção (fila vazia)
        } catch (RuntimeException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}

