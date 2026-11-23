package org.example.dao;

import java.util.Optional;

public interface TeamDao {
    void save (TeamDTO dto);
    Optional<TeamDTO> findOne(Integer id);
    void update (TeamDTO dto);
    void delete (Integer id);
}
