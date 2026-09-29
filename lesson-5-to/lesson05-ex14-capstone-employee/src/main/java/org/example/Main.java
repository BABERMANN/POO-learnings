package org.example;

import java.time.LocalDate;

public class Main {
    static void main(String[] args) {
        System.out.println("ola");


        Employee eredin = new FullTimeEmployee("6767","Eredin","Front-end developer", LocalDate.of(2025, 8 ,20),700);
        Employee apolo = new PerHourEmployee("6767","apolo","Back-end developer", LocalDate.of(2012, 8 ,20),500,5);


        System.out.println(eredin.toString());

        System.out.println();

        System.out.println(apolo.toString());

        System.out.println();

        System.out.println(apolo.equals(eredin));
        System.out.println(eredin.equals(eredin));

    }
}