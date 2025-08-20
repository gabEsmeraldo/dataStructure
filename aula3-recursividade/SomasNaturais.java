public class SomasNaturais {
    
    public static int somaRecursiva(int n){
        if(n == 0) {return 0;}
        return n + (somaRecursiva(n-1));

    }
    public static void main(String[] args) {
        System.out.println(somaRecursiva(5));
    }
}
