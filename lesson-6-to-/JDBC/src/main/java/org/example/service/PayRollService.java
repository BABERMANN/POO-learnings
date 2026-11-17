package org.example.service;

import org.example.model.Company;
import org.example.model.Employee;

import java.time.LocalDate;

public class PayRollService {
    private Company company;
    private EmployeeService employeeService;

    public boolean pay(String id){
        if(id == null || id.isBlank()) throw new IllegalArgumentException("Invalid id");

        Employee e = employeeService.findById(id);
        if(e != null){
            e.addPayCheck(LocalDate.now());
            return true;
        }
        return false;
    }
}
