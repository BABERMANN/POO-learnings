package org.example.database;

import java.sql.*;

public class DataBase {
    public static final String URL = "jdbc:sqlite:banco.db?foreign_keys=on";

    public static void init(){
        String teamSql = """
           CREATE TABLE IF NOT EXISTS team(
            id          INTEGER PRIMARY KEY AUTOINCREMENT,
            name        TEXT NOT NULL,
            base_location       TEXT NOT NULL,
            coach_name      TEXT NOT NULL
            )
           """;

        String playerSql = """
            CREATE TABLE IF NOT EXISTS player(
                id      INTEGER PRIMARY KEY AUTOINCREMENT,
                name    TEXT NOT NULL,
                number  INTEGER NOT NULL,
                position        TEXT NOT NULL,
                is_Field    INTEGER NOT NULL DEFAULT 0,
                team_id     INTEGER,
                FOREIGN KEY(team_id) REFERENCES team(id) ON DELETE SET NULL,
                CHECK (is_field IN(1,0))
                )
            """;

        try(Connection connection = DriverManager.getConnection(DataBase.URL);
            Statement statement = connection.createStatement()){

            statement.execute("PRAGMA foreign_keys = ON");
            statement.execute(teamSql);
            statement.execute(playerSql);

        } catch (SQLException e) {
            throw new RuntimeException("Not possible to create Data Base",e);
        }
    }

}
