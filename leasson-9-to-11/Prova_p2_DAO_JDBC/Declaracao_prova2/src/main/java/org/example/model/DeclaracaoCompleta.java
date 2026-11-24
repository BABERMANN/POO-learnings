package org.example.model;

public class DeclaracaoCompleta extends Declaracao {

    public DeclaracaoCompleta(Integer id, double ganhoTributavel, double valorJapago) {
        super(id, ganhoTributavel, valorJapago);
    }

    @Override
    protected double valorImpost() {
        double ganho = getGanhoTributavel();

        if (ganho <= 22847.88) {
            return 0.0;
        }


        if (ganho <= 33919.92) {
            return (ganho - 22847.88) * 0.075;
        }

        if (ganho <= 45012.72) {
            double impostoFaixa1 = (33919.92 - 22847.88) * 0.075;
            double sobraFaixa2 = (ganho - 33919.92) * 0.15;
            return impostoFaixa1 + sobraFaixa2;
        }


        if (ganho <= 55976.16) {
            double impostoFaixa1 = (33919.92 - 22847.88) * 0.075;
            double impostoFaixa2 = (45012.72 - 33919.92) * 0.15;
            double sobraFaixa3 = (ganho - 45012.72) * 0.225;
            return impostoFaixa1 + impostoFaixa2 + sobraFaixa3;
        }

        double impostoFaixa1 = (33919.92 - 22847.88) * 0.075;
        double impostoFaixa2 = (45012.72 - 33919.92) * 0.15;
        double impostoFaixa3 = (55976.16 - 45012.72) * 0.225;
        double sobraFaixa4 = (ganho - 55976.16) * 0.275;

        return impostoFaixa1 + impostoFaixa2 + impostoFaixa3 + sobraFaixa4;
    }
}
