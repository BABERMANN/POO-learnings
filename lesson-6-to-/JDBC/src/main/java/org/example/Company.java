package org.example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Company {
    private List<Employee> employeesList;

    public Company() {
        employeesList = new ArrayList<>();
    }

    public boolean isValid(String id, String name, String jobTitle, double salary, LocalDate dateOfEmployment){
        return id != null && !id.isBlank()
                && name != null && !name.isBlank()
                && jobTitle != null && !jobTitle.isBlank()
                && salary >0
                && dateOfEmployment != null && !dateOfEmployment.isAfter(LocalDate.now());
    }

    public Employee findById(String id){
        for(Employee e:employeesList){
            if(e.getId().equals(id)) return e;
        }
        return null;
    }

    public boolean hire(String id, String name, String jobTitle, double salary, LocalDate dateOfEmployment) {
        if (!isValid(id,name,jobTitle,salary,dateOfEmployment)) return false;
        if(findById(id) != null) return false;

        Employee employee = new Employee(id, name, jobTitle, salary, dateOfEmployment);
        employeesList.add(employee);
        return true;
    }
}
