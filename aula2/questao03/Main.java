import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Questão 03:");
        System.out.println("Quantos valores devem ser suportados pela array?");
        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();
        Lista list = new Lista(arraySize);
        for(int i = 0; i < list.size(); i++){
            System.out.println("Adicione o " + (i+1) + "º numero no array:");
            list.setar(scanner.nextInt(), i);
        }
        System.out.print("Array antes da ordenação: [ ");
        for(int i = 0; i < list.size(); i++) {
            System.out.print(list.getar(i) + " ");
        }
        list.ordenar();
        System.out.print("]\nArray após a ordenação: [ ");
        for(int i = 0; i < list.size(); i++) {
            System.out.print(list.getar(i) + " ");
        }
        System.out.println("]");
        scanner.close();
        list.remover(list.biggestNumber());
        list.ler();
    }
}
