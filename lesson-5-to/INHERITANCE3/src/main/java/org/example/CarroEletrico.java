package org.example;

public class CarroEletrico extends Veiculo {
    private int autonomiaKm;

    public CarroEletrico(String placa, double velocidadeMaxima, int autonomiaKm) {
        super(placa, velocidadeMaxima);
        this.autonomiaKm = autonomiaKm;
    }
}
