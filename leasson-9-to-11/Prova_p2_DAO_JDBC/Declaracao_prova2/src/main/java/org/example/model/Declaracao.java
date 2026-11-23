package org.example.model;

import java.util.Objects;

public abstract class Declaracao {
    private Integer id;
    private double ganhoTributavel;
    private double valorJapago;

    public Declaracao(Integer id, double ganhoTributavel, double valorJapago) {
        this.id = id;
        this.ganhoTributavel = ganhoTributavel;
        this.valorJapago = valorJapago;
    }

    protected abstract double valorImpost();

    public double valorAPager(){
        return  valorImpost() - valorJapago;
    }

    public Integer getId() {
        return id;
    }

    public double getGanhoTributavel() {
        return ganhoTributavel;
    }

    public double getValorJapago() {
        return valorJapago;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Declaracao that = (Declaracao) o;
        return Objects.equals(getId(), that.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }
}
