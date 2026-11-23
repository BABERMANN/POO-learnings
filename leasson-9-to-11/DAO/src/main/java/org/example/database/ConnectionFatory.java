package org.example.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ConnectionFatory {
    private static Connection connection;

    private ConnectionFatory() {
    }

    public static Connection getConnection() throws SQLException {
        if(connection == null) connection = DriverManager.getConnection(DataBase.URL);
        return connection;
    }


    public static PreparedStatement getPreparedStatement(String sql) throws SQLException {
        return getConnection().prepareStatement(sql);
    }

}
