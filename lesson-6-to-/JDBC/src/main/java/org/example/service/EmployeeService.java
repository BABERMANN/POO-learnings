package org.example.service;

import org.example.database.Database;
import org.example.exception.EmployeeAlreadyExistsException;
import org.example.model.Company;
import org.example.model.Employee;

import java.sql.*;
import java.time.LocalDate;
import java.util.Optional;

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

    public Optional<Employee> findById(String id){
       String sql = "SELECT * FROM employee WHERE id = ?";

       try (Connection connection = DriverManager.getConnection(Database.URL);
            PreparedStatement statement = connection.prepareStatement(sql)){

           statement.setString(1,id);

           ResultSet rs = statement.executeQuery();

           if(rs.next())
               return Optional.of(new Employee(
                       rs.getString("id"),
                       rs.getString("name"),
                       rs.getString("job_title"),
                       rs.getDouble("salary"),
                       LocalDate.parse(rs.getString("date_of_employeement"))));

       } catch (SQLException e) {
           throw new RuntimeException(e);
       }
       return Optional.empty();
    }

    public boolean hire(String id, String name, String jobTitle, double salary, LocalDate dateOfEmployment) {
        if (!isValid(id,name,jobTitle,salary,dateOfEmployment)) throw new IllegalArgumentException("Invalid employee arguments");
        if(findById(id).isPresent()) throw new EmployeeAlreadyExistsException("This employee already existis");

        Employee employee = new Employee(id, name, jobTitle, salary, dateOfEmployment);
        company.getEmployeesList().add(employee);
        return true;
    }

    public boolean fire(String id){
        if(id == null || id.isBlank()) {
            throw new IllegalArgumentException("Id null or invalid");
        }
        Optional<Employee> e = findById(id);
        if(e.isEmpty()) return false;

        company.getEmployeesList().remove(e.get());
        return true;
    }
}
