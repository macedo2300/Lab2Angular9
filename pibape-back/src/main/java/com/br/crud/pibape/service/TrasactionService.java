package com.br.crud.pibape.service;

import com.br.crud.pibape.entity.Trasaction;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface TrasactionService {

    Trasaction findByTrasaction(String trasaction);

    Trasaction createOrUpdate(Trasaction trasaction);

    Optional<Trasaction> findById(String id);

    void delete(Trasaction trasaction);

    List<Trasaction> findAll();

    Page<Trasaction> findAll(Pageable pageable);
}
