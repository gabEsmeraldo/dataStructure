import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Questao01();
        // Questao02();
    }   
    public static void Questao01(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Questão 01:");
        System.out.println("Quantos valores devem ser suportados pela array?");
        int arraySize = scanner.nextInt();
        ArrayList<Integer> values = new ArrayList<>();
        for(int i = 0; i < arraySize; i++){
            System.out.println("Adicione o " + (i+1) + "º numero no array:");
            values.add(scanner.nextInt());
        }
        System.out.print("Array antes da remoção: [ ");
        for(int i = 0; i < values.size(); i++) {
            System.out.print(values.get(i) + " ");
        }
        removeBiggestNumber(values);
        System.out.print("]\nArray após a remoção: [ ");
        for(int i = 0; i < values.size(); i++) {
            System.out.print(values.get(i) + " ");
        }
        System.out.println("]");
        scanner.close();
    }
    public static void removeBiggestNumber(ArrayList<Integer> list){
        int index = 0;
        int placeholder = list.get(0);
        for(int i = 0; i < list.size(); i++){
            int number = list.get(i);
            if(placeholder < number){
                placeholder = number;
                index = i;
            }
        }
        list.remove(index);
    } 
    public static void Questao02(){
        System.out.println("Questão 02:");
        System.out.println("Quantos valores devem ser suportados pela array?");
        Scanner scanner2 = new Scanner(System.in);
        int arraySize = scanner2.nextInt();
        int[] values = new int[arraySize];
        for(int i = 0; i < values.length; i++){
            System.out.println("Adicione o " + (i+1) + "º numero no array:");
            values[i] = scanner2.nextInt();
        }
        System.out.print("Array antes da ordenação: [ ");
        for(int i = 0; i < values.length; i++) {
            System.out.print(values[i] + " ");
        }
        orderNumbers(values);
        System.out.print("]\nArray após a ordenação: [ ");
        for(int i = 0; i < values.length; i++) {
            System.out.print(values[i] + " ");
        }
        System.out.println("]");
        scanner2.close();
    }
    public static void orderNumbers(int[] list){
        int n = list.length;
        int i, j, temp;
        boolean swapped;
        for(i = 0; i < n - 1; i++){
            swapped = false;
            for(j = 0; j < n - i - 1; j++){
                if(list[j] > list[j + 1]){
                    temp = list[j];
                    list[j] = list[j+1];
                    list[j+1] = temp;
                    swapped = true;
                }
            }
        }
    }
}
