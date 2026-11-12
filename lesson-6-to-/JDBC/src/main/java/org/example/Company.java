package org.example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public class Company {
    private  String name;
    private List<Employee> employeesList;

    public Company(String name) {
        employeesList = new ArrayList<>();
        this.name = name;
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

    public boolean fire(String id){
        if(id == null || id.isBlank()) {
            throw new IllegalArgumentException("Id null or invalid");
        }
        Employee e = findById(id);
        if(e == null) return false;

        employeesList.remove(e);
        return true;
    }

    public boolean pay(String id){
        if(id == null || id.isBlank()) throw new IllegalArgumentException("Invalid id");

        Employee e = findById(id);
        if(e != null){
            e.addPayCheck(LocalDate.now());
            return true;
        }
      return false;
    }

    public List<Employee> getJobTitleEmployees(String jobTitle){
        if(jobTitle == null || jobTitle.isBlank()) throw new IllegalArgumentException("JobTitle invalid");

        List<Employee> jobRelated = new ArrayList<>();
        for(Employee e: employeesList) {
                if(jobTitle.equalsIgnoreCase(e.getJobTitle())){
                    jobRelated.add(e);
                }
        }
        return jobRelated;
    }

    public List<Employee> getEmployeesList() {
        return employeesList;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Company company = (Company) o;
        return Objects.equals(name, company.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }
}
