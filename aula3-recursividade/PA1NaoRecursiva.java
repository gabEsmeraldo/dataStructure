public class PA1NaoRecursiva {
    public static void termoPA(int a, int r, int n){
        while(n != 0){
            System.out.println(a);
            a+=r;
            n--;
        }
    }
    public static void main(String[] args) {
        termoPA(2,3,5);
    }
}
