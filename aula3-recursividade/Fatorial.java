public class Fatorial {
    public static int Fatorial(int n){
        if(n == 1){return 1;}
        return n * Fatorial(n - 1);
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println("O Fatorial de " + n + " É: " + Fatorial(n));
    }    
}
