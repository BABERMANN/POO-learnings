package org.example.dao;

import java.util.Optional;

public interface DeclaracaoSimplificada {
    void save (DeclaracaoSimplificadaDto dto);
    Optional<DeclaracaoSimplificadaDto> findOne (Integer id);
    void delete (Integer id);
    void update (DeclaracaoSimplificadaDto declaracaoSimplificadaDTO);
}
