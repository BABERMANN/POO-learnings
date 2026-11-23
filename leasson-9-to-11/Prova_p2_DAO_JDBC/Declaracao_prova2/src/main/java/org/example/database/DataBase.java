package org.example.database;

import java.sql.*;

public class DataBase {
    public static String URL = "jdbc:sqlite:banco.db?foreign_keys=on";

    public static void init() {

        String sqlDespesas = """
        CREATE TABLE IF NOT EXISTS despesa (
            id INTEGER PRIMARY KEY AUTOINCREMENT,
            descricao TEXT,
            valor DOUBLE NOT NULL,
            cnpj TEXT NOT NULL
        )
        """;


        String sqlDeclaracaoCompleta = """
        CREATE TABLE IF NOT EXISTS declaracao_completa (
            id INTEGER PRIMARY KEY AUTOINCREMENT,
            ganho_tributavel DOUBLE NOT NULL,
            valor_ja_pago DOUBLE NOT NULL
        )
        """;


        String sqlDeclaracaoSimplificada = """
        CREATE TABLE IF NOT EXISTS declaracao_simplificada (
            id INTEGER PRIMARY KEY AUTOINCREMENT,
            ganho_tributavel DOUBLE NOT NULL,
            valor_ja_pago DOUBLE NOT NULL
        )
        """;

        String sqlRelacaoDeclaracaoDespesascompleta = """
        CREATE TABLE IF NOT EXISTS relacao_despesa_completa (
            id_despesa    INTEGER,
            id_declaracao INTEGER,
            PRIMARY KEY (id_despesa, id_declaracao),
            FOREIGN KEY(id_despesa) REFERENCES despesa(id) ON DELETE CASCADE,
            FOREIGN KEY(id_declaracao) REFERENCES declaracao_completa(id) ON DELETE CASCADE
        )
        """;

        try (Connection connection = DriverManager.getConnection(DataBase.URL);
             Statement statement = connection.createStatement()) {

            statement.execute(sqlDespesas);
            statement.execute(sqlDeclaracaoCompleta);
            statement.execute(sqlDeclaracaoSimplificada);
            statement.execute(sqlRelacaoDeclaracaoDespesascompleta);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}