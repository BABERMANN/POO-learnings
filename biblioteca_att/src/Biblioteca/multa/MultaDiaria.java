package Biblioteca.multa;

import java.math.BigDecimal;

public class MultaDiaria implements RegraMulta {
   private BigDecimal valorPorDia;

    public MultaDiaria(BigDecimal valorPorDia) {
        this.valorPorDia = valorPorDia;
    }

    @Override
    public BigDecimal calcular(int diasAtraso) {
        BigDecimal dias = BigDecimal.valueOf(diasAtraso);
        return valorPorDia.multiply(dias);
    }
}
