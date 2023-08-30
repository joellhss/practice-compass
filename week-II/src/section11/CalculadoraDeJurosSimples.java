package section11;

import java.math.BigDecimal;

public class CalculadoraDeJurosSimples {

    private BigDecimal valorPrincipal;
    private BigDecimal juros;
    public CalculadoraDeJurosSimples(String valorPrincipal, String juros) {
        this.valorPrincipal = new BigDecimal(valorPrincipal);
        this.juros = new BigDecimal(juros).divide(new BigDecimal("100"));
    }

    public BigDecimal getValorPrincipal() {
        return valorPrincipal;
    }

    public void setValorPrincipal(BigDecimal valorPrincipal) {
        this.valorPrincipal = valorPrincipal;
    }

    public BigDecimal getJuros() {
        return juros;
    }

    public void setJuros(BigDecimal juros) {
        this.juros = juros;
    }

    public BigDecimal calculateTotalValue(int quantidadeDeAnos) {
        BigDecimal anos = new BigDecimal("" + quantidadeDeAnos);
        BigDecimal total = valorPrincipal.add(valorPrincipal.multiply(juros.multiply(anos)));
        return total.setScale(2);
    }
}
