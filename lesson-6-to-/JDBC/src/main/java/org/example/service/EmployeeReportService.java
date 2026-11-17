package org.example.service;

import org.example.model.Company;
import org.example.model.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeReportService {
    private Company company;

    public EmployeeReportService(Company company) {
        this.company = company;
    }

    public double avarageSalary(String jobTitle){
        if(jobTitle == null || jobTitle.isBlank()) throw new IllegalArgumentException("Invalid Jobtitle");

        double sumSalary = 0.0;
        int rounds = 0;
        for(Employee e: company.getEmployeesList()){
            if(jobTitle.equalsIgnoreCase(e.getJobTitle())){
                sumSalary += e.getSalary();
                rounds ++;
            }
        }

        return rounds == 0 ? 00.00 : sumSalary / rounds;
    }

    public List<Employee> getJobTitleEmployees(String jobTitle){
        if(jobTitle == null || jobTitle.isBlank()) throw new IllegalArgumentException("JobTitle invalid");

        List<Employee> jobRelated = new ArrayList<>();
        for(Employee e: company.getEmployeesList()) {
            if(jobTitle.equalsIgnoreCase(e.getJobTitle())){
                jobRelated.add(e);
            }
        }
        return jobRelated;
    }
}
