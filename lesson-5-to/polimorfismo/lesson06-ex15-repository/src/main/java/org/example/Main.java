package org.example;

import java.time.LocalDate;

public class Main {
    static void main(String[] args) {
        System.out.println("Ola");


        Employee caua = new Employee("676767","caua","GP", LocalDate.of(2005,2,2));
        Employee gui = new Employee("676","gui","GP", LocalDate.of(2007,6,2));
        Employee capitao = new Employee("6767","capitao","GP", LocalDate.of(2007,2,2));

        Repository<String,Employee> repository = new FakeEmployeeRepository();

        repository.save(caua);
        repository.save(gui);

        Employee employee1 = repository.findById("1");

        if(employee1 != null) {
            System.out.println(employee1);
        }








    }
}