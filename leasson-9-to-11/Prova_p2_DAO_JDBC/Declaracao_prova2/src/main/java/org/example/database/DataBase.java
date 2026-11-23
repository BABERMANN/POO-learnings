package org.example.database;

import java.sql.*;

public class DataBase {
    public static String URL = "java:sqlite:banco.db?foreign_keys=on";

    public static void init(){
        String sqlDespesas = """
                CREATE TABLE despesas IF NOT EXISTS(
                id      INTEGER PRIMARY KEY AUTOINCREMENT,
                descricao       TEXT,
                valor       DOUBLE NOT NULL,
                cnpj        TEXT NOT NULL
                )
                """;

        String sqlDeclaracaoCompleta = """
                CREATE TABLE declaracao_completa IF NOT EXISTS(
                id      INTEGER PRIMARY KEY AUTOINCREMENT,
                ganho_tributavel        DOUBLE NOT NULL,
                valor_ja_pago           DOUBLE NOT NULL,
                id_despesa      INTEGER,
                FOREIGN KEY id_despesa REFERENCES despesas(id) ON DELETE SET NULL
                """;

        String sqlDeclaracaoSimplificada = """
                CREATE TABLE declaracao_simplificada IF NOT EXISTS(
                id      INTEGER PRIMARY KEY AUTOINCREMENT,
                ganho_tributavel        DOUBLE NOT NULL,
                valor_ja_pago           DOUBLE NOT NULL,
                id_despesa      INTEGER,
                FOREIGN KEY id_despesa REFERENCES despesas(id) ON DELETE SET NULL
                )
                """;

        try(Connection connection = DriverManager.getConnection(DataBase.URL);
            Statement statement = connection.createStatement()) {

            statement.execute(sqlDespesas);
            statement.execute(sqlDeclaracaoCompleta);
            statement.execute(sqlDeclaracaoSimplificada);


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
