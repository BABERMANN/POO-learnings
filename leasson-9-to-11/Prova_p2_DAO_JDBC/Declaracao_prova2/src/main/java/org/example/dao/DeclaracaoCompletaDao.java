package org.example.dao;

import org.example.model.DeclaracaoCompleta;

import java.util.Optional;

public interface DeclaracaoCompletaDao {
    void save (DeclaracaoCompletaDto dto);
    Optional<DeclaracaoCompleta> findOne (Integer id);
    void delete (Integer id);
    void update (DeclaracaoCompletaDto declaracaoCompletaDto);

}
