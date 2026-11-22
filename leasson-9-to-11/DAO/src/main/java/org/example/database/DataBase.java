package org.example.database;

import java.sql.Connection;
import java.sql.SQLException;

public class DataBase {
    public static final String URL = "jdbc:sqlite:banco.db";

    public DataBase() throws SQLException {

    }

    public static void init(){
        String teamSql = """
           CREATE TABLE IF NOT EXISTS team(
            id          INTEGER NOT NULL AUTOINCREMENT,
            name        TEXT NOT NULL,
            base_location       TEXT NOT NULL,
            coach_name      TEXT NOT NULL,
            PRIMARY KEY(id)
            )
           """;

        String playerSql = """
            CREATE TABLE IF NOT EXISTS player(
                id      INTEGER NOT NULL AUTOINCREMENT,
                name    TEXT NOT NULL,
                number  INTEGER NOT NULL,
                position        TEXT NOT NULL,
                is_Field    INTEGER NOT NULL DEFAULT 0,
                team_id     INTEGER,
                PRIMARY KEY (id),
                FOREIGN KEY(team_id) REFERENCES team(id)
                )
            """;

        try
    }

}
