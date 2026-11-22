package org.example.service;

import com.sun.jdi.IntegerValue;
import org.example.database.Database;
import org.example.exception.EmployeeAlreadyExistsException;
import org.example.exception.EmployeeDoesNotExistsException;
import org.example.model.Company;
import org.example.model.Employee;

import java.net.URL;
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
           throw new RuntimeException("Cannot find this employee",e);
       }
       return Optional.empty();
    }

    public void hire(String id, String name, String jobTitle, double salary, LocalDate dateOfEmployment) {
        if (!isValid(id,name,jobTitle,salary,dateOfEmployment)) throw new IllegalArgumentException("Invalid employee arguments");
        if(findById(id).isPresent()) throw new EmployeeAlreadyExistsException("This employee already existis");

        String sql = "INSERT INTO employee VALUES (?,?,?,?,?,?)";

        try (Connection connection = DriverManager.getConnection(Database.URL);
             PreparedStatement statement = connection.prepareStatement(sql) ){;

             statement.setString(1,id);
             statement.setString(2,name);
             statement.setString(3,jobTitle);
             statement.setString(4, dateOfEmployment.toString());
             statement.setDouble(5,salary);
             statement.setString(6, company.getId());
             statement.executeUpdate();


        } catch (SQLException e) {
            throw new RuntimeException("Cannot insert this employee ", e);
        }
    }

    public void fire(String id){

        String sql = "DELETE FROM employee WHERE id = ?";

        try (Connection connection = DriverManager.getConnection(Database.URL);
             PreparedStatement statement = connection.prepareStatement(sql)){

            statement.setString(1,id);

            if(statement.executeUpdate() == 0){
                throw new EmployeeDoesNotExistsException("Employee: " + id + "does not exists");
            }


        } catch (SQLException e) {
            throw new RuntimeException("Error finding employee " + id,e);
        }
    }
}
