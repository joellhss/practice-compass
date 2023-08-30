package section11;

public class IncrementExample {
    public static void main(String[] args) {
        int a = 5;
        int b = 5;

        int preIncrementResult = ++a; // Pré-incremento
        int postIncrementResult = b++; // Pós-incremento

        System.out.println("Valor original de 'a': " + a); // Saída: Valor original de 'a': 6
        System.out.println("Resultado do pré-incremento: " + preIncrementResult); // Saída: Resultado do pré-incremento: 6

        System.out.println("Valor original de 'b': " + b); // Saída: Valor original de 'b': 6
        System.out.println("Resultado do pós-incremento: " + postIncrementResult); // Saída: Resultado do pós-incremento: 5
    }
}
