package org.example;

import java.util.Objects;

public class Coordenada {
    private double latitude;
    private double longitude;

    public Coordenada(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Coordenada cordenada = (Coordenada) obj;
        if (Double.compare(latitude, cordenada.latitude) == 0 && Double.compare(longitude, cordenada.longitude) == 0)       // Retorna 0 se a == b, Retorna um número negativo se a < b, Retorna um número positivo se a > b melhor no tratamento de Nan
            return true;
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(latitude, longitude);  // Objects.hash() pega todos os valores que eu passar nele e faz uma conta pra gerar um hash code
        // caso crie um outro objeto com os mesmos valores o codigo hash vai ser igual
    }
}
