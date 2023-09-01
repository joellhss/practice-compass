package section14;

public class MyNumber {
    private int number;

    public MyNumber(int number) {
        this.number = number;
    }

    public boolean isPrime() {
        if (this.number > 1) {
            int contador = 0;
            for(int i=1; i <= this.number; i++) {
                if (this.number % i == 0) {
                    contador++;
                }
            }
            if (contador == 2) {
                return true;
            }
        }
        return false;
    }
    public int sumUptoN() {
        int contador = 0;
        for (int i = 0; i <= this.number; i++) {
            contador += i;
        }
        return contador;
    }
    public int sumOfDivisors() {
        int contador = 0;
        for (int i = 1; i <= this.number; i++) {
            if(this.number % i == 0) {
                contador += i;
            }
        }
        return contador;
    }
    public void printANumberTriangle() {
        System.out.println("");
        for(int i = 1; i <= this.number; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println("");
        }
    }
}
