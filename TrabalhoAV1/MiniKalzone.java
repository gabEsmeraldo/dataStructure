public class MiniKalzone {

  public static void main(String[] args) {
    ListaDuplamenteEncadeada filaDeEspera = new ListaDuplamenteEncadeada();
    System.out.println("Adicionando quatro Pedidos:");
    filaDeEspera.adicionarPedido(new Pedido("Gabriel", "Quatro Queijos", "Kalzone Chocolate", "Suco de Maracujá"));
    filaDeEspera.adicionarPedido(new Pedido("Carlos","Maxi Beef", "Sem", "Coca-Cola"));
    filaDeEspera.adicionarPedido(new Pedido("Clara","Português", "Kalzone Nutella", "Suco de laranja"));
    filaDeEspera.adicionarPedido(new Pedido("Guilherme","Frango", "Frango Catupiry", "Sem Noção"));
    filaDeEspera.listarPedidos();
    System.out.println("\nAlterando pedido na posição 1");
    Pedido.alterarPedido(filaDeEspera.getPedido(1), "Calabresa","Maxi Beef","Coca-cola Zero");
    filaDeEspera.listarPedidos();
    filaDeEspera.removerPedido(3);
    filaDeEspera.removerPedido();
    System.out.println("\nRemovidos 2 pedidos");
    System.out.print("Listando pedidos Restantes: ");
    filaDeEspera.quantidadePedidosRestantes();
    filaDeEspera.listarPedidos();
    filaDeEspera.removerPedido();
    System.out.println("\nListando pedidos após remoção");
    filaDeEspera.listarPedidos();
  }
}
