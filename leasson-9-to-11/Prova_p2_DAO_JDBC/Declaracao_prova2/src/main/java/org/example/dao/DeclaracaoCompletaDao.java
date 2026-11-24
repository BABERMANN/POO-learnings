package org.example.dao;

import org.example.model.DeclaracaoCompleta;

import java.util.Optional;

public interface DeclaracaoCompletaDao {
    void save (DeclaracaoCompleta declaracaoCompleta);
    Optional<DeclaracaoCompleta> findOne (Integer id);
    void delete (Integer id);
    Optional<DeclaracaoCompleta> update (DeclaracaoCompletaDto declaracaoCompletaDto);

}
