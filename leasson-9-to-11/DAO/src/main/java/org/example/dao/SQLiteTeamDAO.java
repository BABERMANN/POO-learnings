package org.example.dao;

import org.example.database.ConnectionFatory;
import org.example.database.DataBase;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Optional;

public class SQLiteTeamDAO implements TeamDao{


    @Override
    public void save(TeamDTO dto) {
        String sql = "INSERT INTO team (name,base_location,coach_name) VALUES(?,?,?)";
        try(var statement = ConnectionFatory.getPreparedStatement(sql)) {
            statement.setString(1,dto.name());
            statement.setString(2,dto.baseLocation());
            statement.setString(3,dto.coachName());
            if(statement.executeUpdate() == 0) throw new IllegalArgumentException("Not possible to save team");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Optional<TeamDTO> findOne(Integer id) {
        String sql = "SELECT FROM team WHERE id = ?";
        try (var statement  = ConnectionFatory.getPreparedStatement(sql)){
            statement.setInt(1,id);
            ResultSet rs = statement.executeQuery();

            if (rs.next()){
                return Optional.of(new TeamDTO(rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("base_location"),
                        rs.getString("coach_name")));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return Optional.empty();
    }

    @Override
    public void update(TeamDTO dto) {
        String sql = "UPDATE team SET name = ?, base_location = ?, coach_name = ? WHERE id = ?";
        try (var statement = ConnectionFatory.getPreparedStatement(sql)){
            statement.setString(1, dto.name());
            statement.setString(2, dto.baseLocation());
            statement.setString(3,dto.coachName());
            statement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException("Cannot update this team",e);
        }
    }

    @Override
    public void delete(Integer id) {
        String sql = "DELETE from team WHERE id = ?";
        try(var statement = ConnectionFatory.getPreparedStatement(sql)){
            statement.setInt(1,id);
            if(statement.executeUpdate() == 0) throw new IllegalArgumentException("Not possible to delete team");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
