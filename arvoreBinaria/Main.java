package arvoreBinaria;

public class Main {

  public static void main(String[] args) {
    // Criando os nós
    NoArvoreBinaria<String> raiz = new NoArvoreBinaria<>("A");
    NoArvoreBinaria<String> b = new NoArvoreBinaria<>("B");
    NoArvoreBinaria<String> c = new NoArvoreBinaria<>("C");
    NoArvoreBinaria<String> d = new NoArvoreBinaria<>("D");
    NoArvoreBinaria<String> e = new NoArvoreBinaria<>("E");

    // Montando a árvore binária
    raiz.setEsquerdo(b);
    raiz.setDireito(c);
    b.setEsquerdo(d);
    b.setDireito(e);

    ArvoreBinaria<String> arvore = new ArvoreBinaria<>(raiz);

    // Testes
    System.out.println("Caminhamento Pré-Ordem:");
    arvore.preOrdem(); // A B D E C

    System.out.println("\n\nCaminhamento Em-Ordem:");
    arvore.inOrdem(); // D B E A C

    System.out.println("\n\nCaminhamento Pós-Ordem:");
    arvore.posOrdem(); // D E B C A

    System.out.println("\n\nTotal de nós: " + arvore.contarNos()); // 5
    System.out.println("Altura da árvore: " + arvore.altura()); // 2
  }
}
