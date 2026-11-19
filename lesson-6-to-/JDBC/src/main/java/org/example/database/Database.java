package org.example.database;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class Database {
    public static final String URL = "jdbc:sqlite:banco.db";

    public Database() throws SQLException {
    }

    public static void init(){
        String companySql = """
                CREATE TABLE IF NOT EXISTS company(
                    id      TEXT NOT NULL,
                    name    TEXT,
                    PRIMARY KEY(ID)
                    )
                """;

        String employeeSql = """
                CREATE TABLE IF NOT EXISTS employee(
                    id      TEXT NOT NULL,
                    name    TEXT,
                    job_Title   TEXT,
                    date_of_employeement    TEXT,
                    salary      REAL,
                    company_id      TEXT,
                    PRIMARY KEY(id),
                    FOREIGN KEY(company_id) REFERENCES company(id)
                )
                """;

        String payCheck = """
                CREATE TABLE IF NOT EXISTS pay_check(
                    id      INTEGER NOT NULL,
                    employee_id     TEXT,
                    payday      TEXT NOT NULL,
                    salary      REAL,
                    PRIMARY KEY(id),
                    FOREIGN KEY(employee_id) REFERENCES employee(id)
                )
                """;

    try (Connection connection = DriverManager.getConnection(URL);
        Statement statement = connection.createStatement()) {

        statement.execute(companySql);
        statement.execute(employeeSql);
        statement.execute(payCheck);
    } catch (SQLException e){
        e.printStackTrace();
    }


    }



}
