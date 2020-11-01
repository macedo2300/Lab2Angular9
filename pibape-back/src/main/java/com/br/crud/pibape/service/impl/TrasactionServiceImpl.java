package com.br.crud.pibape.service.impl;

import com.br.crud.pibape.entity.Trasaction;
import com.br.crud.pibape.repositoty.TrasactoinRepository;
import com.br.crud.pibape.service.TrasactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TrasactionServiceImpl implements TrasactionService {

    @Autowired
    private TrasactoinRepository trasactoinRepository;


    @Override
    public Trasaction findByTrasaction(String trasaction) {
        return this.trasactoinRepository.findByTrasaction(trasaction);
    }

    @Override
    public Trasaction createOrUpdate(Trasaction trasaction) {
        return this.trasactoinRepository.save(trasaction);
    }

    @Override
    public Optional<Trasaction> findById(String id) {
        return this.trasactoinRepository.findById(id);
    }

    @Override
    public void delete(Trasaction trasaction) {
        this.trasactoinRepository.delete(trasaction);
    }

    @Override
    public List<Trasaction> findAll() {
        return this.trasactoinRepository.findAll();
    }

    @Override
    public Page<Trasaction> findAll(Pageable pageable) {
        return this.trasactoinRepository.findAll(pageable);
    }
}
