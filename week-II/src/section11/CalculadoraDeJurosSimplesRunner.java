package section11;

import java.math.BigDecimal;

public class CalculadoraDeJurosSimplesRunner {
    public static void main(String[] args) {
        CalculadoraDeJurosSimples calcular = new CalculadoraDeJurosSimples("4500.00", "7.5");
        BigDecimal totalValue = calcular.calculateTotalValue(5);
        System.out.println(totalValue);
    }
}
