public class Main {

  public static void main(String[] args) {
    PilhaSimplesmenteEncadeada pilha = new PilhaSimplesmenteEncadeada();

    System.out.println("Pilha vazia? " + pilha.isEmpty());

    pilha.push(10);
    pilha.push(20);
    pilha.push(30);

    System.out.println("Topo da pilha: " + pilha.top()); // 30
    System.out.println("Tamanho: " + pilha.size()); // 3

    System.out.println("Removido: " + pilha.pop()); // 30
    System.out.println("Topo após pop: " + pilha.top()); // 20
    System.out.println("Tamanho após pop: " + pilha.size()); // 2

    System.out.println("Removido: " + pilha.pop()); // 20
    System.out.println("Removido: " + pilha.pop()); // 10

    System.out.println("Pilha vazia? " + pilha.isEmpty()); // true
    // Descomente a linha abaixo para testar exceção
    // System.out.println("Tentando acessar topo da pilha vazia: " + pilha.top());
  }
}
