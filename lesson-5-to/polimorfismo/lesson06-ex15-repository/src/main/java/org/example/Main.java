package org.example;

import java.time.LocalDate;

public class Main {
    static void main(String[] args) {
//        System.out.println("Ola");


        Employee caua = new Employee("01","caua","GP", LocalDate.of(2005,2,2));
        Employee gui = new Employee("02","gui","GP", LocalDate.of(2007,6,2));
        Employee capitao = new Employee("03","capitao","GP", LocalDate.of(2007,2,2));
        Employee apolo = new Employee("04","apolo","GP", LocalDate.of(2014,2,2));

        Repository<String,Employee> repository = new FakeEmployeeRepository();

        RegisterEmployeeService registerEmployeeService = new RegisterEmployeeService(repository);
        FindEmployeeService findEmployeeService = new FindEmployeeService(repository);

        if(registerEmployeeService.register(caua)){
            System.out.println("Operando");
        }

        if(registerEmployeeService.register(caua)){
            System.out.println("OPERANDO");
        }else System.out.println("ja registrado");

        registerEmployeeService.register(gui);
        registerEmployeeService.register(capitao);

        System.out.println("|------------------------------------|");

        Employee employee1 = findEmployeeService.findById("01");

        if(employee1 != null) {
            System.out.println(employee1);
        }










    }
}