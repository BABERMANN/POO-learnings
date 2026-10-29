package org.example;

import eredin.exemple.SensorTemperatura;

public class Main {
    static void main(String[] args) {
        System.out.println("ola");

        SensorTemperatura sensor = new SensorTemperatura(30);
        System.out.println(sensor.SomaUm());
    }
}