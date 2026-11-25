package org.example.dao;

import org.example.database.ConnectionFactory;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Optional;

public class SQLiteDeclaracaoSimplificadaDao implements DeclaracaoSimplificada{

    @Override
    public void save(DeclaracaoSimplificadaDto dto) {


        String sql = "INSERT INTO declaracao_simplificada (ganho_tributavel,valor_ja_pago) VALUES (?,?)";

        try (var statement = ConnectionFactory.getPreparedStatment(sql)){

            statement.setDouble(1, dto.ganho_tributavel());
            statement.setDouble(2,dto.valor_ja_pago());

            if(statement.executeUpdate() == 0) throw new IllegalArgumentException("Cannot save declaration");

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public Optional<DeclaracaoSimplificadaDto> findOne(Integer id) {
        if(id == null || id <= 0) throw new IllegalArgumentException("Invalid id");

        String sql = "SELECT FROM declaracao_simplificada WHERE id = ?";

        try(var statement = ConnectionFactory.getPreparedStatment(sql)) {

            statement.setInt(1,id);

            ResultSet rs = statement.executeQuery();

            if(rs.next()){
                return Optional.of(new DeclaracaoSimplificadaDto(rs.getInt("id"),
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
        if(id == null || id <= 0) throw new IllegalArgumentException("invalid id");

        String sql = "DELETE FROM declaracao_simplificada WHERE id = ?";

        try (var statement = ConnectionFactory.getPreparedStatment(sql)){

            statement.setInt(1,id);

            if (statement.executeUpdate() == 0) throw new IllegalArgumentException("Cannot Delete");

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void update(DeclaracaoSimplificadaDto declaracaoSimplificadaDTO) {
        if(declaracaoSimplificadaDTO == null) throw new IllegalArgumentException("Invalid Declaracao");

        String sql = "UPDATE declaracao_simplificada SET ganho_tributavel = ?, valor_ja_pago = ?, WHERE id = ?";

        try (var statement = ConnectionFactory.getPreparedStatment(sql)){

            statement.setDouble(1,declaracaoSimplificadaDTO.ganho_tributavel());
            statement.setDouble(2,declaracaoSimplificadaDTO.valor_ja_pago());
            statement.setInt(3,declaracaoSimplificadaDTO.id());
            statement.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
