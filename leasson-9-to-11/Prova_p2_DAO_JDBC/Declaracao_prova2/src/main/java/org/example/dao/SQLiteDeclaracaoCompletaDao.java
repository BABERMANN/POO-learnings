package org.example.dao;

import org.example.database.ConnectionFactory;
import org.example.model.DeclaracaoCompleta;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Optional;

public class SQLiteDeclaracaoCompletaDao implements DeclaracaoCompletaDao{




    @Override
    public void save(DeclaracaoCompleta declaracaoCompleta) {

        String sql = "INSERT INTO declaracao_completa (ganho_tributavel,valor_pago) VALUES (?,?)";

        try (var statement = ConnectionFactory.getPreparedStatment(sql)){

            statement.setDouble(1,declaracaoCompleta.getGanhoTributavel());
            statement.setDouble(2,declaracaoCompleta.getValorJapago());

            if(statement.executeUpdate() == 0) throw new IllegalArgumentException("Not possible to save declaracao completa");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public Optional<DeclaracaoCompleta> findOne(Integer id) {
        if(id == null || id <= 0) throw new IllegalArgumentException("Invalid id");

        String sql = "SELECT FROM declaracao_completa WHERE id = ?";

        try(var statement = ConnectionFactory.getPreparedStatment(sql)) {

            statement.setInt(1,id);
            ResultSet rs = statement.executeQuery();

            if(rs.next()){
                return Optional.of(new DeclaracaoCompleta(rs.getInt("id"),
                                rs.getDouble("ganho_tributavel"),
                                rs.getDouble("valor_ja_pago")));
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return Optional.empty();
    }

    @Override
    public void delete(Integer id) {
        if(id == null || id <= 0) throw new IllegalArgumentException("Invalid id");

        String sql = "DELETE FROM declaracao_completa WHERE id = ?";

        try (var statement = ConnectionFactory.getPreparedStatment(sql)){

            statement.setInt(1,id);
            if(statement.executeUpdate() == 0) throw new IllegalArgumentException("Cannot delete declaracao completa");

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public Optional<DeclaracaoCompleta> update(DeclaracaoCompletaDto declaracaoCompletaDto) {
        if(declaracaoCompletaDto == null) throw new IllegalArgumentException("Declaracao invalida");

        String sql = "UPDATE declaracao_completa SET ganho_tributavel = ?, valorJaPago = ?,WHERE id = ?";

        try (var statement = ConnectionFactory.getPreparedStatment(sql)){

            statement.setDouble(1,declaracaoCompletaDto.ganhoTributavel());
            statement.setDouble(2,declaracaoCompletaDto.ganhoTributavel());
            statement.setInt(3,declaracaoCompletaDto.id());

            if(statement.executeUpdate() == 0) throw new IllegalArgumentException("Cannot update declaracao");

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
