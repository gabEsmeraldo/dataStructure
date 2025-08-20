public class Fibonnaci {
    public static int Fibonnaci(int n){
        if(n >= 0 && n <= 2){return 1;}
        return Fibonnaci(n - 1) + Fibonnaci(n - 2);
    }
    public static void main(String[] args) {
        int n = 10;
        System.out.println("O Fibonnaci " + n + " É: " + Fibonnaci(n));
    }    
}
