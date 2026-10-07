package org.infra;

import java.time.LocalDate;
import java.time.Period;
import java.util.Objects;

public class Jogador {
    final private String id;
    final private String name;
    private String posicion;
    private int number;
    private double salary;
    final private LocalDate dateOfEmployement;

    public Jogador(String id, String name, String posicion, int number, double salary, LocalDate dateOfEmployement) {
        this.id = id;
        this.name = name;
        this.posicion = posicion;
        this.number = number;
        this.salary = salary;
        this.dateOfEmployement = dateOfEmployement;
    }

    public int getNumber() {
        return number;
    }

    public String getPosicion() {
        return posicion;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getDateOfEmployement() {
        return dateOfEmployement;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Jogador{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", posicion='" + posicion + '\'' +
                ", number=" + number +
                ", salary=" + salary +
                ", dateOfEmployement=" + dateOfEmployement +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Jogador jogador = (Jogador) o;
        return Objects.equals(id, jogador.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    public double increaseSalary(){
        double bonus = 0.05;
        if(Period.between(dateOfEmployement,LocalDate.now()).getYears() > 2){
            bonus = 0.167;
        }
        return salary * bonus;
    }

    public void jiglePrint(){
        System.out.println("Essa é a LEUD com o " + name + "entao esquece");
    }

}