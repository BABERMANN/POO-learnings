package org.example.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ConnectionFactory {
    private static Connection connection;

    public ConnectionFactory() {
    }

    public static Connection getConnection() throws SQLException {
        if (connection == null) connection = DriverManager.getConnection(DataBase.URL);
        return connection;
    }

    public static PreparedStatement getPreparedStatment(String sql) throws SQLException {
        return getConnection().prepareStatement(sql);
    }
}
