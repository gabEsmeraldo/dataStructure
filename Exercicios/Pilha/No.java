public class No {
    public No proximo;
    public char caractere;

    public No(char caractere) {
        this.proximo = null;
        this.caractere = caractere;
    }    
    public char getChar(){
        return caractere;
    }
}
