public class Main {

  public static void main(String[] args) {
    ListaDuplamenteEncadeada lista = new ListaDuplamenteEncadeada();
    lista.inserirNoInicio(10);
    lista.inserirNoFim(30);
    lista.imprimirLista();

    lista.inserir(25, 2);
    lista.imprimirLista();

    lista.remover(2);
    lista.imprimirLista();

    System.out.println("Primeiro: " + lista.pegaPrimeiro());
    System.out.println("Próximo: " + lista.pegaProximo());
    System.out.println("Último: " + lista.pegaUltimo());
    System.out.println("Anterior: " + lista.pegaAnterior());
  }
}
