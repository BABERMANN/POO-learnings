package org.example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main(String[] args) {
        System.out.println("Ola Eredin");


       Employee employee1 = new Employee("001","Eredin","Estagiario",2500.00,LocalDate.of(2026,1,20));

       employee1.addPayCheck(LocalDate.of(2026,2,20));
        employee1.addPayCheck(LocalDate.of(2026,3,20));
        employee1.addPayCheck(LocalDate.of(2026,4,20));
        employee1.addPayCheck(LocalDate.of(2026,5,20));
        employee1.addPayCheck(LocalDate.of(2026,6,20));
        employee1.addPayCheck(LocalDate.of(2026,7,20));
        employee1.addPayCheck(LocalDate.of(2026,8,20));
        employee1.addPayCheck(LocalDate.of(2026,9,20));
        employee1.addPayCheck(LocalDate.of(2026,10,20));


        employee1.removePayCheck(LocalDate.of(2026,2,20));

        for(PayCheck p : employee1.getPayChecks()){
            System.out.println(p.toString());
        }

    }
}