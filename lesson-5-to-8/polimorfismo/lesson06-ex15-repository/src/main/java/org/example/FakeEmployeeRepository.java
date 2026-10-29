package org.example;

import java.util.ArrayList;

public class FakeEmployeeRepository implements Repository<String,Employee> {
    private ArrayList<Employee> employees;
    private int p;

    public FakeEmployeeRepository() {
        employees = new ArrayList<>();
    }

    @Override
    public void save(Employee entity) {
        employees.add(entity);
    }

    @Override
    public Employee findById(String id) {
        for (Employee employee : employees) {
            if (employee.getId().equals(id)) {
                return employee;
            }
        }
      return null;
    }

    @Override
    public Employee[] findAll() {
        return employees.toArray(new Employee[0]);
    }
}


//    @Override
//    public Employee[] findAll() {
//        Employee[] search = new Employee[p];
//        for(i = 0; i < p; i++){
//            search[i] = employees[i];
//        }
//        return search;
//    }
