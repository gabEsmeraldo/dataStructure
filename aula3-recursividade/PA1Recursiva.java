public class PA1Recursiva {
    public static void termoPA(int a1, int r, int p){
        if(p == 0){return; }
        System.out.println(a1);
        termoPA(a1+r,r,p-1);
    }
    public static void main(String[] args) {
        termoPA(2,3,5);
    }
}
