package org.example;

import java.time.LocalDate;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Ola");

        Employee caua = new Employee("01","caua","GP", LocalDate.of(2005,2,2));
        Employee gui = new Employee("02","gui","GP", LocalDate.of(2007,6,2));
        Employee capitao = new Employee("03","capitao","GP", LocalDate.of(2007,2,2));
        Employee apolo = new Employee("04","apolo","GP", LocalDate.of(2014,2,2));
        Employee emp05 = new Employee("05", "Bruno", "Dev", LocalDate.of(2004, 3, 15));
        Employee emp06 = new Employee("06", "Lucas", "QA", LocalDate.of(2005, 7, 22));
        Employee emp07 = new Employee("07", "Gabriel", "Design", LocalDate.of(2003, 11, 5));
        Employee emp08 = new Employee("08", "Matheus", "GP", LocalDate.of(2006, 1, 10));
        Employee emp09 = new Employee("09", "Pedro", "Dev", LocalDate.of(2002, 5, 19));
        Employee emp10 = new Employee("10", "Thiago", "QA", LocalDate.of(2005, 9, 14));
        Employee emp11 = new Employee("11", "Gustavo", "Design", LocalDate.of(2004, 12, 1));
        Employee emp12 = new Employee("12", "Vinicius", "GP", LocalDate.of(2005, 4, 28));
        Employee emp13 = new Employee("13", "Rodrigo", "Dev", LocalDate.of(2003, 8, 8));
        Employee emp14 = new Employee("14", "Vitor", "QA", LocalDate.of(2004, 6, 30));
        Employee emp15 = new Employee("15", "Arthur", "Design", LocalDate.of(2006, 3, 3));
        Employee emp16 = new Employee("16", "Caio", "GP", LocalDate.of(2004, 10, 25));
        Employee emp17 = new Employee("17", "Daniel", "Dev", LocalDate.of(2003, 2, 11));
        Employee emp18 = new Employee("18", "Eduardo", "QA", LocalDate.of(2005, 12, 12));
        Employee emp19 = new Employee("19", "Felipe", "Design", LocalDate.of(2004, 5, 24));
        Employee emp20 = new Employee("20", "Leonardo", "GP", LocalDate.of(2005, 1, 15));
        Employee emp21 = new Employee("21", "Marcelo", "Dev", LocalDate.of(2001, 7, 7));
        Employee emp22 = new Employee("22", "Henrique", "QA", LocalDate.of(2004, 4, 18));
        Employee emp23 = new Employee("23", "Murilo", "Design", LocalDate.of(2005, 8, 9));
        Employee emp24 = new Employee("24", "Otavio", "GP", LocalDate.of(2003, 10, 31));
        Employee emp25 = new Employee("25", "Douglas", "Dev", LocalDate.of(2003, 6, 14));
        Employee emp26 = new Employee("26", "Diego", "QA", LocalDate.of(2005, 2, 20));
        Employee emp27 = new Employee("27", "Igor", "Design", LocalDate.of(2004, 9, 5));
        Employee emp28 = new Employee("28", "Renan", "GP", LocalDate.of(2006, 4, 12));
        Employee emp29 = new Employee("29", "Alex", "Dev", LocalDate.of(2003, 1, 29));
        Employee emp30 = new Employee("30", "Andre", "QA", LocalDate.of(2004, 8, 22));
        Employee emp31 = new Employee("31", "Samuel", "Design", LocalDate.of(2005, 10, 3));
        Employee emp32 = new Employee("32", "Wesley", "GP", LocalDate.of(2004, 7, 17));
        Employee emp33 = new Employee("33", "Marcos", "Dev", LocalDate.of(2002, 12, 25));
        Employee emp34 = new Employee("34", "Ricardo", "QA", LocalDate.of(2005, 3, 8));
        Employee emp35 = new Employee("35", "Alan", "Design", LocalDate.of(2006, 5, 14));
        Employee emp36 = new Employee("36", "Fabricio", "GP", LocalDate.of(2003, 9, 19));
        Employee emp37 = new Employee("37", "Hugo", "Dev", LocalDate.of(2003, 5, 11));
        Employee emp38 = new Employee("38", "Julio", "QA", LocalDate.of(2005, 11, 30));
        Employee emp39 = new Employee("39", "Luis", "Design", LocalDate.of(2004, 2, 13));
        Employee emp40 = new Employee("40", "Yuri", "GP", LocalDate.of(2004, 11, 21));
        Employee emp41 = new Employee("41", "Danilo", "Dev", LocalDate.of(2002, 4, 4));
        Employee emp42 = new Employee("42", "Breno", "QA", LocalDate.of(2004, 6, 17));
        Employee emp43 = new Employee("43", "Caetano", "Design", LocalDate.of(2006, 7, 9));
        Employee emp44 = new Employee("44", "Victor", "GP", LocalDate.of(2003, 3, 26));
        Employee emp45 = new Employee("45", "Ruan", "Dev", LocalDate.of(2003, 10, 12));
        Employee emp46 = new Employee("46", "Kaique", "QA", LocalDate.of(2005, 1, 7));
        Employee emp47 = new Employee("47", "Nicolas", "Design", LocalDate.of(2004, 8, 3));
        Employee emp48 = new Employee("48", "Erick", "GP", LocalDate.of(2005, 9, 28));
        Employee emp49 = new Employee("49", "Thomas", "Dev", LocalDate.of(2002, 11, 16));
        Employee emp50 = new Employee("50", "Jonathan", "QA", LocalDate.of(2004, 1, 22));
        Employee emp51 = new Employee("51", "Augusto", "Design", LocalDate.of(2005, 6, 11));
        Employee emp52 = new Employee("52", "Sandro", "GP", LocalDate.of(2004, 4, 5));
        Employee emp53 = new Employee("53", "Christian", "Dev", LocalDate.of(2002, 8, 14));
        Employee emp54 = new Employee("54", "Leandro", "QA", LocalDate.of(2004, 10, 9));


        Repository<String,Employee> repository = new FakeEmployeeRepository();

        RegisterEmployeeService registerEmployeeService = new RegisterEmployeeService(repository);
        FindEmployeeService findEmployeeService = new FindEmployeeService(repository);


        if(registerEmployeeService.register(caua)){
            System.out.println("Operando");
        }

        if(registerEmployeeService.register(caua)){
            System.out.println("OPERANDO");
        } else {
            System.out.println("ja registrado");
        }


        registerEmployeeService.register(gui);
        registerEmployeeService.register(capitao);
        registerEmployeeService.register(apolo);
        registerEmployeeService.register(emp05);
        registerEmployeeService.register(emp06);
        registerEmployeeService.register(emp07);
        registerEmployeeService.register(emp08);
        registerEmployeeService.register(emp09);
        registerEmployeeService.register(emp10);
        registerEmployeeService.register(emp11);
        registerEmployeeService.register(emp12);
        registerEmployeeService.register(emp13);
        registerEmployeeService.register(emp14);
        registerEmployeeService.register(emp15);
        registerEmployeeService.register(emp16);
        registerEmployeeService.register(emp17);
        registerEmployeeService.register(emp18);
        registerEmployeeService.register(emp19);
        registerEmployeeService.register(emp20);
        registerEmployeeService.register(emp21);
        registerEmployeeService.register(emp22);
        registerEmployeeService.register(emp23);
        registerEmployeeService.register(emp24);
        registerEmployeeService.register(emp25);
        registerEmployeeService.register(emp26);
        registerEmployeeService.register(emp27);
        registerEmployeeService.register(emp28);
        registerEmployeeService.register(emp29);
        registerEmployeeService.register(emp30);
        registerEmployeeService.register(emp31);
        registerEmployeeService.register(emp32);
        registerEmployeeService.register(emp33);
        registerEmployeeService.register(emp34);
        registerEmployeeService.register(emp35);
        registerEmployeeService.register(emp36);
        registerEmployeeService.register(emp37);
        registerEmployeeService.register(emp38);
        registerEmployeeService.register(emp39);
        registerEmployeeService.register(emp40);
        registerEmployeeService.register(emp41);
        registerEmployeeService.register(emp42);
        registerEmployeeService.register(emp43);
        registerEmployeeService.register(emp44);
        registerEmployeeService.register(emp45);
        registerEmployeeService.register(emp46);
        registerEmployeeService.register(emp47);
        registerEmployeeService.register(emp48);
        registerEmployeeService.register(emp49);
        registerEmployeeService.register(emp50);
        registerEmployeeService.register(emp51);
        registerEmployeeService.register(emp52);
        registerEmployeeService.register(emp53);
        registerEmployeeService.register(emp54);

        System.out.println("|------------------------------------|");

        Employee employee1 = findEmployeeService.findById("01");

        if(employee1 != null) {
            employee1.setSalary(7000.00);
            System.out.println(employee1);
        }

        Employee[] copy = findEmployeeService.findAll();  //TODO print allEmplooyee
        System.out.println(Arrays.toString(copy));

        System.out.println("|------------------------------------|");

        Employee[] tecumseh = findEmployeeService.findAll();
        System.out.println(Arrays.toString(tecumseh));
    }
}
