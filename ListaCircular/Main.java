public class Main {

  public static void main(String[] args) {
    ListaCircular lista = new ListaCircular();

    lista.inserir(10);
    lista.inserir(20);
    lista.inserir(30);
    System.out.println("Tamanho: " + lista.tamanho()); // 3

    System.out.println("Elemento no cursor: " + lista.pegaElemento()); // 10
    lista.avanca();
    System.out.println(
      "Elemento no cursor após avançar: " + lista.pegaElemento()
    ); // 20
    lista.remove();
    System.out.println("Tamanho após remoção: " + lista.tamanho()); // 2

    lista.avanca();
    System.out.println(
      "Elemento no cursor após avançar: " + lista.pegaElemento()
    ); // 30

    lista.remove();
    lista.remove();
    System.out.println("Lista está vazia? " + lista.estaVazio()); // true
  }
}
