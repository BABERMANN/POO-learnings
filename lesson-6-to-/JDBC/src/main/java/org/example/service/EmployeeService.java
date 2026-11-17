package org.example.service;

import org.example.model.Company;
import org.example.model.Employee;

import java.time.LocalDate;

public class EmployeeService {
    private Company company;

    public EmployeeService(Company company) {
        this.company = company;
    }

    public boolean isValid(String id, String name, String jobTitle, double salary, LocalDate dateOfEmployment){
        return id != null && !id.isBlank()
                && name != null && !name.isBlank()
                && jobTitle != null && !jobTitle.isBlank()
                && salary >0
                && dateOfEmployment != null && !dateOfEmployment.isAfter(LocalDate.now());
    }

    public Employee findById(String id){
        for(Employee e: company.getEmployeesList()){
            if(e.getId().equals(id)) return e;
        }
        return null;
    }

    public boolean hire(String id, String name, String jobTitle, double salary, LocalDate dateOfEmployment) {
        if (!isValid(id,name,jobTitle,salary,dateOfEmployment)) return false;
        if(findById(id) != null) return false;

        Employee employee = new Employee(id, name, jobTitle, salary, dateOfEmployment);
        company.getEmployeesList().add(employee);
        return true;
    }

    public boolean fire(String id){
        if(id == null || id.isBlank()) {
            throw new IllegalArgumentException("Id null or invalid");
        }
        Employee e = findById(id);
        if(e == null) return false;

        company.getEmployeesList().remove(e);
        return true;
    }
}
