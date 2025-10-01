class PilhaSimplesmenteEncadeada {
    private No top;
    private int size;

    public PilhaSimplesmenteEncadeada() {
        top = null;
        size = 0;
    }

    public void push(int item) {
        No no = new No(item);
        no.setNext(top);
        top = no;
        size++;
    }

    public int pop() {
        if (isEmpty()) throw new RuntimeException("Pilha vazia");
        int value = top.getValue();
        top = top.getNext();
        size--;
        return value;
    }

    public int top() {
        if (isEmpty()) throw new RuntimeException("Pilha vazia");
        return top.getValue();
    }

    public boolean isEmpty() {
        return top == null;
    }

    public int size() {
        return size;
    }
}