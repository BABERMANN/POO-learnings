package org.example.service;

import org.example.database.Database;
import org.example.exception.EmployeeDoesNotExistsException;
import org.example.model.Company;
import org.example.model.Employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.Optional;

public class PayRollService {
    final private Company company;
    final private EmployeeService employeeService;

    public PayRollService(Company company, EmployeeService employeeService) {
        this.company = company;
        this.employeeService = employeeService;
    }

    public void pay(String id){
        Employee employee = employeeService.findById(id)
                .orElseThrow(() -> new EmployeeDoesNotExistsException("Employee that conatins id: " + id + "does not exist");

        String sql = "INSERT INTO pay_check (employee_id,payday,salary) VALUES(?,?,?)";

        try(Connection conection  = DriverManager.getConnection(Database.URL);
            PreparedStatement statement = conection.prepareStatement(sql)){


            statement.setString(1,id);
            statement.setString(2,LocalDate.now().toString());
            statement.setString(3,employee.getSalary().toString());

            statement.executeUpdate();


        } catch (SQLException e) {
            throw new RuntimeException("Its  not possible to bind paycheks to this employee",e);
        }


    }
}
