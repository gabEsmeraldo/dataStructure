public class AvaliadorExpressaoPosfixa {
    private Pilha operadores = new Pilha();
    private Pilha operandos = new Pilha();
    public char[] entrada;

    public AvaliadorExpressaoPosfixa() {
    }
    
    public void calculate(String entry){
        entrada = entry.toCharArray();
        for (char c : entrada) {
            if(Character.isDigit(c)){
                operandos.push(c);
            }else{
                operadores.push(c);
            }
        }
        System.out.println("Operandos:");
        while(operandos.isEmpty()){
            System.out.print(operandos.pop());
        }
        System.out.println();
        System.out.println("Operadores");
        while(operadores.isEmpty()){
            System.out.println(operadores.pop());
        }
    }
}

// Depois, implemente a classe AvaliadorExpressaoPosfixa, que deverá:

// Receber como entrada uma expressão matemática pós-fixada (ex: "3 4 + 2 * 7 /").

// Avaliar e exibir o resultado final da expressão.