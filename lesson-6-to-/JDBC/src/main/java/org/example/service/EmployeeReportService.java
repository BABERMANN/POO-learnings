package org.example.service;

import org.example.database.Database;
import org.example.model.Company;
import org.example.model.Employee;

import java.math.BigDecimal;
import java.net.URL;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeReportService {
    private Company company;

    public EmployeeReportService(Company company) {
        this.company = company;
    }

    public double avarageSalary(String jobTitle){
        String sql = "SELECT AVG(salary) FROM employee WHERE job_Title = ?";

        try (Connection connection = DriverManager.getConnection(Database.URL);
              PreparedStatement statement = connection.prepareStatement(sql)){

            statement.setString(1,jobTitle);

            try (ResultSet rs = statement.executeQuery()){
                if(rs.next()) return rs.getDouble(1);
            }


        } catch (SQLException e) {
            throw new RuntimeException("Cannot calculete average salary ",e);
        }
        return  0.0;
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
