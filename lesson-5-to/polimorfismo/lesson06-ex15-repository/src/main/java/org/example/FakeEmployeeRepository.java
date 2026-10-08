package org.example;

import java.util.Arrays;

public class FakeEmployeeRepository implements Repository<String,Employee> {
    private Employee[] employees;
    private int p;

    public FakeEmployeeRepository() {
        employees = new Employee[99]; // TODO array aumentar de tamanho
    }

    @Override
    public void save(Employee entity) {
        employees[p] = entity;
        p++;
    }

    @Override
    public Employee findById(String id) {
        for (int i = 0; i < p; i++) {
            if (employees[i].getId().equals(id)) {
                return employees[i];
            }
        }
        return null;
    }

    @Override
    public Employee[] findAll() {
        return Arrays.copyOf(employees, p);
    }
}


//    @Override
//    public Employee[] findAll() {
//        Employee[] search = new Employee[p];
//        for(int i = 0; i < p; i++){
//            search[i] = employees[i];
//        }
//        return search;
//    }
