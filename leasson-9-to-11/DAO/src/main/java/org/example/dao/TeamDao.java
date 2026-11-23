package org.example.dao;

import java.util.Optional;

public interface TeamDto {
    void save (TeamDto dto);
    Optional<TeamDto> findOne(String sku);
    void update (TeamDto dto);
    void delete (TeamDto dto);
}
