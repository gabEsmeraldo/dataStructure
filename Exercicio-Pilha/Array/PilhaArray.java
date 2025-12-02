class PilhaArray {
    private int[] data;
    private int top;
    
    public PilhaArray(int capacity) {
        data = new int[capacity];
        top = -1;
    }
    
    public void push(int item) {
        if (top == data.length - 1) throw new RuntimeException("Pilha cheia");
        data[++top] = item;
    }
    
    public int pop() {
        if (isEmpty()) throw new RuntimeException("Pilha vazia");
        return data[top--];
    }
    
    public int top() {
        if (isEmpty()) throw new RuntimeException("Pilha vazia");
        return data[top];
    }
    
    public boolean isEmpty() {
        return top == -1;
    }
    
    public int size() {
        return top + 1;
    }
}