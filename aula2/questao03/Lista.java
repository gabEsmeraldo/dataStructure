
public class Lista {
    private int[] list;

    public Lista(int size){
        list = new int[size];
    }

    public Lista(){
        list = new int[10];
    }

    public void ler(){
        for(int i = 0; i < list.length; i++){
            System.out.println(list[i]);
        }
        System.out.println("Fim da lista.");
    }
    public int getar(int i){
        return list[i];
    }
    public void setar(int n, int i){
        list[i] = n;
    }
    public void remover(int i){
        for(;i < list.length; i++){
            if ((i+1) >= list.length) {
                list[i] = 0;
            }else{
                list[i] = list[i+1];
            }
        }
    }
    public int size(){
        return list.length;
    }
    public int biggestNumber(){
        int index = 0;
        int placeholder = list[0];
        for(int i = 0; i < list.length; i++){
            int number = list[i];
            if(placeholder < number){
                placeholder = number;
                index = i;
            }
        }
       return index;
    } 
    public void ordenar(){
        int n = list.length;
        int i, j ,temp;
        boolean swapped;
        for(i = 0; i < n - 1; i++){
            swapped = false;
            for(j = 0; j < n - i - 1; j++){
                if(list[j] > list[j+1]){
                    temp = list[j];
                    list[j] = list[j+1];
                    list[j+1] = temp;
                    swapped = true;
                }
            }
        }
    }
}
