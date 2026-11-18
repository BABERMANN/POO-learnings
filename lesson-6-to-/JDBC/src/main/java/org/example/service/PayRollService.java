package org.example.service;

import org.example.model.Company;
import org.example.model.Employee;

import java.time.LocalDate;
import java.util.Optional;

public class PayRollService {
    final private Company company;
    final private EmployeeService employeeService;

    public PayRollService(Company company, EmployeeService employeeService) {
        this.company = company;
        this.employeeService = employeeService;
    }

    public boolean pay(String id){
        if(id == null || id.isBlank()) throw new IllegalArgumentException("Invalid id");

        Optional<Employee> e = employeeService.findById(id);
        if(e.isPresent()){
            e.get().addPayCheck(LocalDate.now());
            return true;
        }
        return false;
    }
}
