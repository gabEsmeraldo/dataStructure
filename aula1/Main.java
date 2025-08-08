import java.util.Random;
public class Main{
    public static void main(String[] args) {
        System.out.println("Questao 1");
        int[] numeros = new int[10];
        for(int i = 0; i < numeros.length; i++){
            numeros[i] = ((i+1)*10);
        }
        for (int j = 0; j < numeros.length; j++) {
            System.out.println(numeros[j]);
        }


        System.out.println("\n Questao 2");
        char[][] caracteres = new char[4][4];
        char letra = 'a';
        for(int i = 0; i <= 3; i++){
            for(int j = 0; j <=3; j++){
                caracteres[i][j] = letra++;
            }
        }
        for(int i = 0; i <= 3; i++){
            for(int j = 0; j <=3; j++){
                System.out.print(caracteres[i][j]);
            }
            System.out.println();
        }


        System.out.println("\n Questao 3");
        Random random = new Random();
        int[] vetor = new int[10];
        for(int i = 0; i < vetor.length; i++){
            vetor[i] = random.nextInt(1000);
        }
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }


        System.out.println("\n Questao 4");
        System.out.println("O menor valor é: " + menorValor(vetor));
        System.out.println("O maior valor é: " + maiorValor(vetor));


        System.out.println("\n Questao 5");
        int[][] matrizA = new int[3][3];
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                matrizA[i][j] = random.nextInt(1000);
            }
        }
        for(int i = 0; i < 3; i++){
            for(int j = 0; j <3; j++){
                System.out.print(matrizA[i][j] + " ");
            }
            System.out.println();
        }
        for(int i = 0; i < 3; i++){
            int linha = 0;
            for(int j = 0; j <3; j++){
                linha += matrizA[i][j];
            }
            System.out.println("Linha " + (i+1) + " igual a: " + linha);
        }


        System.out.println("\n Questao 6");
        int[][] matrizB = new int[5][5];
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                matrizB[i][j] = random.nextInt(1000);
            }
        }
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                System.out.print(matrizB[i][j] + " ");
            }
            System.out.println();
        }
        maiorValorMatriz(matrizB);
    }



    public static void maiorValorMatriz(int[][] matrix){
        int[] values = new int[25];
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                values[i*j] = matrix[i][j];
            }
        }
        System.out.println(maiorValor(values));
    }

    public static int menorValor(int[] vetor){
        int menorValor = vetor[0];
        for(int i = 0; i < vetor.length; i++){
            if(menorValor>vetor[i]){
                menorValor = vetor[i];
            }
        }
        return menorValor;
    }

    public static int maiorValor(int[] vetor){
        int maiorValor = vetor[0];
        for(int i = 0; i < vetor.length; i++){
            if(maiorValor<vetor[i]){
                maiorValor = vetor[i];
            }
        }
        return maiorValor;
    }
}