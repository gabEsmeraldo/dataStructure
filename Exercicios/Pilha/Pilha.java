
import javax.management.RuntimeErrorException;

class Pilha {
    public No top;
    public int size;

    public Pilha() {
    }
    
    public void push(char elemento){
        No no = new No(elemento);
        if(top == null){
            top = no;
        }else{
            no.proximo = top;
            top = no;
        }
        size++;
    }

    public char pop(){
        if(top != null){
            char carac = top.getChar();
            top = top.proximo;
            size--;
            return carac;
        }else{
            return 'n';
        }
    }

    public char peek(){
        char carac = top.getChar();
        return carac;
    }

    public boolean isEmpty(){
        return top == null;
    }

    public int size(){
        return size;
    }
}