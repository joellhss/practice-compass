package section12;

import java.util.Scanner;

public class MenuRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira o primeiro número: ");
        int number1 = scanner.nextInt();
        System.out.println("O número escolhido foi " + number1);

        System.out.println("Insira o segundo número: ");
        int number2 = scanner.nextInt();
        System.out.println("O número escolhido foi " + number2);

        System.out.println("Escolha o número da operação desejada: \n1 - Adição\n2 - Subtração\n3 - Multiplicação\n4 - Divisão");
        int choice = scanner.nextInt();

        Menu operation = new Menu(number1, number2, choice);
        operation.calculate();
    }
}
