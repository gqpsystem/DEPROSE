package com.megacenter.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.megacenter.model.TipoDocumeto;

@Repository
public interface ITipoDocumentoRepository extends JpaRepository<TipoDocumeto, Integer> {

}
